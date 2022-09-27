package no.hiof.janaathm;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Star sun = new Star("Sun", 695342,1.9885*Math.pow(10,30),5777);

        Planet mercury = new Planet("Mercury", 2439.7, 3.283*Math.pow(10,23),0.387, 0.206, 88);
        Planet venus = new Planet("Venus", 6051.8, 4.867*Math.pow(10,24),0.723, 0.007, 225);
        Planet earth = new Planet("Earth", 6372,5.972*Math.pow(10,24),1, 0.017, 365);
        Planet mars = new Planet("Mars", 3389.5, 6.39*Math.pow(10,23),1.524, 0.093, 687);
        Planet jupiter = new Planet("Jupiter", 69911, 1.898*Math.pow(10,27),5.20440, 0.049, 4380);
        Planet saturn = new Planet("Saturn", 58232, 5.683*Math.pow(10,26),9.5826, 0.057, 10585);
        Planet uranus = new Planet("Uranus", 25362, 8.681*Math.pow(10,25), 19.2184, 0.046, 30660);
        Planet neptune = new Planet("Neptune", 24622, 1.024*Math.pow(10,26),30.11, 0.010, 60225);


        ArrayList<Planet>planets = new ArrayList<Planet>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);


    /*
        double storsteRadius = 0, storsteMasse = 0;
        String storstePlanet = "";
        for (int i = 0; i < planets.size(); i++) {
            if (planets.get(i).getRadius() == storsteRadius) {
                if (planets.get(i).getMass() > storsteMasse) {
                    storsteMasse = planets.get(i).getMass();
                    storstePlanet = planets.get(i).getName();
                }
                else continue;
            }

            else if (planets.get(i).getRadius() > storsteRadius) {
                storsteRadius = planets.get(i).getRadius();
                storstePlanet = planets.get(i).getName();
            }

            if (i == (planets.size()-1)) {
                System.out.println("Planeten med størst radius er: " + storstePlanet);
            }
        }

         */


        Planet storstePlan = planets.get(0);
        for (int i = 0; i < planets.size(); i++) {
            if (planets.get(i).getRadius() > storstePlan.getRadius()) {
                storstePlan = planets.get(i);
            }
        }
        System.out.println("Største planeten: " + storstePlan);



	    PlanetSystem solarSystem = new PlanetSystem("Solar system", sun, planets);
	    /*
        System.out.println(solarSystem.toString());
        System.out.println(earth.toString());
        System.out.println(jupiter.toString());
        System.out.println("Saturns Mjup er: " + saturn.konverteringMjup() + "og Rjup er: " + saturn.konverteringRjup());
        System.out.println("Solas Msun er: " +  sun.konverteringMsun() + "og Rsun er: " + sun.konverteringRsun());
        System.out.println("Surface gravity på " + neptune.getName() + " er:" + neptune.surfaceGravity());
        */

        //oblig 3
        earth.CentralObject("sun",sun.getMass());
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(0) + "km to the Sun at 0 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(90) + "km to the Sun at 90 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(180) + "km to the Sun at 180 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(270) + "km to the Sun at 270 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(360) + "km to the Sun at 360 degrees");

        System.out.println("At a distance of " + earth.distanceToCentralBody(0) + "km, Earth has a velocity of " + earth.orbitingVelocity(earth.distanceToCentralBody(0)) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(45) + "km, Earth has a velocity of " + earth.orbitingVelocity(earth.distanceToCentralBody(45)) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(90) + "km, Earth has a velocity of " + earth.orbitingVelocity(earth.distanceToCentralBody(90)) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(135) + "km, Earth has a velocity of " + earth.orbitingVelocity(earth.distanceToCentralBody(135)) + "km/s");
        System.out.println("At a distance of " + earth.distanceToCentralBody(180) + "km, Earth has a velocity of " + earth.orbitingVelocity(earth.distanceToCentralBody(180)) + "km/s");

        //søke funksjon
        System.out.println(solarSystem.searchByName());

    }
}
