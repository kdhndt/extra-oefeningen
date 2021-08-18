package be.vdab.oef1;

public class Persoon {
    private final String voornaam;
    private final String familienaam;

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public String getNaam() {
        return "Voornaam: " + voornaam + "\nFamilienaam: " + familienaam;
    }

    @Override
    public String toString() {
        return "Voornaam: " + voornaam + " ; " + "Familienaam: " + familienaam;
    }
}
