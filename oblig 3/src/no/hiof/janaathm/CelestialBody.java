package no.hiof.janaathm;

public abstract class CelestialBody {

    protected String name;
    protected double radius, mass, semiMajorAxis, eccentricity, orbitalPeriod;
    private double G = 6.67408 * Math.pow(10,-11);

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public CelestialBody(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getG() {
        return G;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }


    @Override
    public String toString() {
        return name + " har radiusen: " + getRadius() + " og massen: " + getMass();
    }
}