package no.hiof.janaathm.controller;

import io.javalin.http.Context;
import no.hiof.janaathm.model.CelestialBody;
import no.hiof.janaathm.model.Planet;
import no.hiof.janaathm.repository.IUniverseRepository;
import no.hiof.janaathm.repository.UniverseRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class PlanetController extends UniverseRepository {

    public void getAllPlanetsC(Context ctx) {
        String planetSystemName = ctx.pathParam(":planet-system-id");
        String query = ctx.queryParam("sort_by");
        ArrayList<Planet> planetList = getAllPlanets(planetSystemName);

        if (query != null) {
            switch (query) {
                case "":
                    Collections.sort(planetList);
                    break;
                case "name":
                    planetList.sort(Comparator.comparing(CelestialBody::getName));
                    break;
                case "mass":
                    planetList.sort(Comparator.comparing(CelestialBody::getMass));
                case "radius":
                    planetList.sort(Comparator.comparing(CelestialBody::getRadius));
                    break;
            }
        }
        ctx.json(planetList);
    }

    public void getPlanetC(Context ctx) {
        String planetSystemName = ctx.pathParam(":planet-system-id");
        String planetName = ctx.pathParam(":planet-id");

        Planet planet = getPlanet(planetSystemName, planetName);
        ctx.json(planet);


    }

}
