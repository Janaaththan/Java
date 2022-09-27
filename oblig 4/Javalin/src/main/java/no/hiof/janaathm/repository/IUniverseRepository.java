package no.hiof.janaathm.repository;

import no.hiof.janaathm.model.Planet;
import no.hiof.janaathm.model.PlanetSystem;

import java.util.ArrayList;

public interface IUniverseRepository {
    ArrayList<PlanetSystem> getAllPlanetSystems();
    ArrayList<Planet> getAllPlanets(String sysName);
    PlanetSystem getPlanetSystem(String sysName);
    Planet getPlanet(String sysName, String planetName);
}
