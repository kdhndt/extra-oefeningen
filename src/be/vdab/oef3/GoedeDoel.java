package be.vdab.oef3;

public class GoedeDoel {
    private final String naam;
    private int totaal;

    public GoedeDoel(String naam) {
        this.naam = naam;
    }

    public void toevoegen(int bedrag) {
        totaal += bedrag;
    }

    public String getNaam() {
        return naam;
    }

    public int getTotaal() {
        return totaal;
    }
}
