package no.hiof.janaathm.model;

import org.jetbrains.annotations.NotNull;

import javax.management.MBeanAttributeInfo;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class NaturSatellite extends CelestialBody  implements  Comparable<NaturSatellite> {
    private double semiMajorAxis, eccentricity, orbitalPeriod;
    private String centralObject;
    private double centralMass;

    public NaturSatellite(double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(semiMajorAxis, eccentricity, orbitalPeriod);
    }

    public NaturSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, String pictureUrl) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, pictureUrl);
    }

    public NaturSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(name, radius, mass, semiMajorAxis, eccentricity,orbitalPeriod);
    }


    public void CentralObject(String centralObject, double centralMass) {
        this.centralObject = centralObject;
        this.centralMass = centralMass;
    }

    public int distanceToCentralBody(double degrees) {
        double a = getSemiMajorAxis();
        double e = getEccentricity();
        double r;
        r = 149597871*(a*(1-Math.pow(e,2))/(1+e*Math.cos(Math.toRadians(degrees))));
        return (int) Math.round(r);
    }

    public double orbitingVelocity(double distance) {
        double hastighetIMeter;
        hastighetIMeter = Math.sqrt((getG()*centralMass)/distance*1000);
        return Math.round(100.0*hastighetIMeter/1000000)/100.0;
    }

    @Override
    public int compareTo(@NotNull NaturSatellite o) {
        double radius = ((NaturSatellite) o).getRadius();
        return (int) (radius - getRadius());
    }




}

