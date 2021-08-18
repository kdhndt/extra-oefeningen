package be.vdab.oef2;

import be.vdab.oef1.Persoon;

public class Politieker extends Persoon {
    private PolitiekePartij partij;

    public Politieker(String voornaam, String familienaam, PolitiekePartij partij) {
        super(voornaam, familienaam);
        setPartij(partij);
    }

    public void setPartij(PolitiekePartij partij) {
        this.partij = partij;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPartijnaam: " + partij.getNaam() + " ; " + "Aantal leden: " + partij.getAantalLeden();
    }
}