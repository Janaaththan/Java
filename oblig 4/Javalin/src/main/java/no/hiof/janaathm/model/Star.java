package no.hiof.janaathm.model;

import java.net.MalformedURLException;
import java.net.URL;

public class Star extends CelestialBody{
    private double effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;

    }


    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    public double konverteringRsun() {
        return (getRadius()/695700);
    }
    public double konverteringMsun() {
        return (getMass()/(1.98892*Math.pow(10,30)));
    }

    @Override
    public String toString() {
        return "Star[name:"+ getName() + ", mass:" + getMass() + ", radius:" + getRadius() + "effectiveTemp:" + getEffectiveTemp() + "]";
    }
}

