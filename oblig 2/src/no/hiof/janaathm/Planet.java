package no.hiof.janaathm;

public class Planet {
    private String name;
    private double radius, mass;
    private double G = 6.67408 * Math.pow(10,-11);

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }


    public double konverteringRjup() {
        return (getRadius()/71492);
    }
    public double konverteringMjup() {
        return (getMass()/(1.898*Math.pow(10, 27)));
    }

    public double surfaceGravity() {
        return (G * getMass())/Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return name + " har radiusen: " + getRadius() + " og massen: " + getMass() ;
    }
}
