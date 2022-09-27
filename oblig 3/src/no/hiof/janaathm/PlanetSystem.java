package no.hiof.janaathm;

import  java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class PlanetSystem {
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList<Planet>();

    private Scanner sc;

    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;

        sc = new Scanner(System.in);
    }

    public String searchByName(){
        int index =0;
        System.out.print("Search for planet: ");
        String planet = sc.next();
        Vector<String> v = new Vector<String>();
        for (int i = 0; i < planets.size(); i++) {
            v.add(planets.get(i).getName());
        }
        index = v.indexOf(planet);

        while(index == -1) {
            System.out.print("Search for planet: ");
            planet = sc.next();
            index = v.indexOf(planet);

        }
        Planet pp = planets.get(index);
        return pp.toString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "Planetsystemet " + name + " har midtstjernen: " + centerStar.getName() + " og planetene " + planets;
    }
}
