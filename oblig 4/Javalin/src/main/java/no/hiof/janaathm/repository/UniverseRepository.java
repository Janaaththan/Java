package no.hiof.janaathm.repository;

import no.hiof.janaathm.model.Planet;
import no.hiof.janaathm.model.PlanetSystem;
import no.hiof.janaathm.model.Star;

import java.util.ArrayList;

public class UniverseRepository implements IUniverseRepository {
    ArrayList<PlanetSystem> planetSystemsTotal = new ArrayList<>();
    ArrayList<Planet> solarSystemP = new ArrayList<>();

    public UniverseRepository() {
        Star sun = new Star("Sun", 695342,1.9885*Math.pow(10,30),5777);

        Planet mercury = new Planet("Mercury", 3.283E23,2439.7, 0.387, 0.206, 88, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Transit_Of_Mercury%2C_May_9th%2C_2016.png/480px-Transit_Of_Mercury%2C_May_9th%2C_2016.png", sun);
        Planet venus = new Planet("Venus",4.867E24,6051.8, 0.723, 0.007, 225, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/SDO%27s_Ultra-high_Definition_View_of_2012_Venus_Transit_%28304_Angstrom_Full_Disc_02%29.jpg/480px-SDO%27s_Ultra-high_Definition_View_of_2012_Venus_Transit_%28304_Angstrom_Full_Disc_02%29.jpg", sun);
        Planet earth = new Planet("Earth",5.972E24,6371, 1, 0.017, 365, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/NASA_Earth_America_2002.jpg/480px-NASA_Earth_America_2002.jpg", sun);
        Planet mars = new Planet("Mars",6.39E23,3389.5, 1.524, 0.093, 687, "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Mars_23_aug_2003_hubble.jpg/480px-Mars_23_aug_2003_hubble.jpg", sun);
        Planet jupiter = new Planet("Jupiter",1.898E27,69911, 5.20440, 0.049, 4380, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg/480px-Jupiter_and_its_shrunken_Great_Red_Spot.jpg", sun);
        Planet saturn = new Planet("Saturn",5.683E26,58232, 9.5826, 0.057, 10585, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Saturn_from_Cassini_Orbiter_-_Square_%282004-10-06%29.jpg/480px-Saturn_from_Cassini_Orbiter_-_Square_%282004-10-06%29.jpg", sun);
        Planet uranus = new Planet("Uranus",8.681E25,25362, 19.2184, 0.046, 30660,"https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Uranus2.jpg/480px-Uranus2.jpg", sun);
        Planet neptune = new Planet("Neptune",1.024E26,24622, 30.11, 0.010, 60225,"https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Neptune_Full_%28cropped%29.jpg/480px-Neptune_Full_%28cropped%29.jpg", sun);
        Planet pluto = new Planet("Pluto", 1.205E22, 1184, 40, 0.024, 90613, "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Pluto_by_LORRI_and_Ralph%2C_13_July_2015.jpg/375px-Pluto_by_LORRI_and_Ralph%2C_13_July_2015.jpg",sun);

        solarSystemP.add(mercury);
        solarSystemP.add(venus);
        solarSystemP.add(earth);
        solarSystemP.add(mars);
        solarSystemP.add(jupiter);
        solarSystemP.add(saturn);
        solarSystemP.add(uranus);
        solarSystemP.add(neptune);
        solarSystemP.add(pluto);

        PlanetSystem solarSystem = new PlanetSystem("Solarsystem", sun, solarSystemP, "https://upload.wikimedia.org/wikipedia/commons/c/c3/Solar_sys8.jpg");
        planetSystemsTotal.add(solarSystem);
    }

    @Override
    public ArrayList<PlanetSystem> getAllPlanetSystems() {
        return planetSystemsTotal;
    }


    @Override
    public PlanetSystem getPlanetSystem(String sysName) {
        for (PlanetSystem planetSystem: planetSystemsTotal) {
            if (planetSystem.getName().equals(sysName)) {
                return planetSystem;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Planet> getAllPlanets(String sysName) {
        PlanetSystem aPlanetSystem = getPlanetSystem(sysName);

        if (aPlanetSystem != null) {
            return aPlanetSystem.getPlanets();
        }
        return null;
    }

    @Override
    public Planet getPlanet(String sysName, String planetName) {
        PlanetSystem planetSystem = getPlanetSystem(sysName);
        ArrayList<Planet> allPlanets = planetSystem.getPlanets();
        for (Planet planet: allPlanets) {
            if (planet.getName().equals(planetName)) {
                return planet;
            }
        }
        return null;
    }


}
