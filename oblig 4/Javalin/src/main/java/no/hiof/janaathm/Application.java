package no.hiof.janaathm;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.janaathm.controller.PlanetController;
import no.hiof.janaathm.controller.PlanetSystemController;
import no.hiof.janaathm.model.PlanetSystem;
import no.hiof.janaathm.repository.UniverseRepository;
import org.jetbrains.annotations.NotNull;

public class Application {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start();
        app.config.enableWebjars();

        app.get("/", new VueComponent("hello-world"));
        app.get("/planet-systems", new VueComponent("planet-system-overview"));
        app.get("/planet-systems/:planet-system-id", new VueComponent("planet-system-detail"));
        app.get("/planet-systems/:planet-system-id/planets/:planet-id", new VueComponent("planet-detail"));

        UniverseRepository universeRepository = new UniverseRepository();
        PlanetSystemController planetSystemController = new PlanetSystemController();
        PlanetController planetController = new PlanetController();

        app.get("api/planet-systems", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                planetSystemController.getAllPlanetSystemC(ctx);
            }
        });

        app.get("api/planet-systems/:planet-system-id", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                planetSystemController.getPlanetSystemC(ctx);
            }
        });

        app.get("api/planet-systems/:planet-system-id/planets", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                planetController.getAllPlanetsC(ctx);
            }
        });

        app.get("api/planet-systems/:planet-system-id/planets/:planet-id", new Handler() {
            @Override
            public void handle(@NotNull Context ctx) throws Exception {
                planetController.getPlanetC(ctx);
            }
        });
    }





}
