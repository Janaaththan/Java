package no.hiof.janaathm;

import javax.management.MBeanAttributeInfo;

public class NaturSatellite extends CelestialBody{
    private double semiMajorAxis, eccentricity, orbitalPeriod;
    private String centralObject;
    private double centralMass;

    // Feil under ved datatype definering av semiMAjorAxis. Skal egentlig være double men noe med konverteringsfeil
    public NaturSatellite(String semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(semiMajorAxis, eccentricity, orbitalPeriod);
    }

    public NaturSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod);
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
}

