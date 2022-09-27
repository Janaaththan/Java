package no.hiof.janaathm;

public class Planet extends NaturSatellite{
    private String name;
    private double radius, mass;
    public final double RJUP = 71492;
    public final double MJUP = 1.898E27;
    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod);
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

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                "Surface gravity: " + surfaceGravity() +
                '}';
    }
}
