public class Planet {
    private String navn;
    private float radius, gravitasjon;

    public Planet(String navn, float radius, float gravitasjon) {
        this.navn = navn;
        this.radius = radius;
        this.gravitasjon = gravitasjon;

    }

    public String getNavn() {
        return navn;
    }
    public void setNavn(String nyNavn) {
        this.navn = nyNavn;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float nyRadius) {
        this.radius = nyRadius;
    }

    public float getGravitasjon() {
        return gravitasjon;
    }
    public void setName(float nyGravitasjon) {
        this.gravitasjon = nyGravitasjon;
    }



    public void PlanetPrint() {
        System.out.println("Planeten " + navn + " har en radius på " + radius + " km og en gravitasjon på " + gravitasjon + " m/s2");};
}