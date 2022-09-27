package no.hiof.janaathm.model;

import org.jetbrains.annotations.NotNull;

import java.net.MalformedURLException;
import java.net.URL;

public class Planet extends NaturSatellite{
    private String name;
    private double radius, mass;
    private Star centralCelestialBody;
    public final double RJUP = 71492;
    public final double MJUP = 1.898E27;


    public Planet(String name, double mass, double radius, double semiMajorAxis, double eccentricity, double orbitalPeriod, String pictureUrl, Star centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, pictureUrl);
        this.centralCelestialBody = centralCelestialBody;
    }




    public double konverteringRjup() {
        return (getRadius()/RJUP);
    }
    public double konverteringMjup() {
        return (getMass()/(MJUP));
    }

    public double surfaceGravity() {
        return (getG() * getMass())/Math.pow(getRadius(), 2) *1000;
    }

    public Star getCentralCelestialBody() {
        return centralCelestialBody;
    }

    @Override
    public String toString() {
        return "Planet[name:"+ getName() + ", mass:" + getMass() + ", radius:" + getRadius() + ", semiMajorAxis:" + getSemiMajorAxis() + ", eccentricity:" +
        getEccentricity() + ", orbitalPeriod:" + getOrbitalPeriod() + ", pictureUrl:" + getPictureUrl() + ", centralCelestialBody;"+ getCentralCelestialBody() +"]";
    }
    @Override
    public int compareTo(@NotNull NaturSatellite o) {
        double radius = ((NaturSatellite) o).getRadius();
        return (int) ( radius - getRadius());
    }
}
