package no.hiof.janaathm.controller;

import io.javalin.http.Context;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import no.hiof.janaathm.model.Planet;
import no.hiof.janaathm.model.PlanetSystem;
import no.hiof.janaathm.repository.IUniverseRepository;
import no.hiof.janaathm.repository.UniverseRepository;

import java.util.ArrayList;


public class PlanetSystemController extends UniverseRepository {



    public void getAllPlanetSystemC(Context ctx) {
        ArrayList<PlanetSystem> planetSystems = getAllPlanetSystems();
        ctx.json(planetSystems);
    }

    public void getPlanetSystemC(Context ctx) {
        String planetSystemName = ctx.pathParam(":planet-system-id");
        PlanetSystem planetSystem = getPlanetSystem(planetSystemName);
        ctx.json(planetSystem);
    }
}
