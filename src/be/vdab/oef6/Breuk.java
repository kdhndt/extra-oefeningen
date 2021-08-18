package be.vdab.oef6;

public class Breuk {
    private int teller;
    private int noemer;

    public Breuk(int teller, int noemer) {
        setTeller(teller);
        setNoemer(noemer);
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public void setNoemer(int noemer) {
        if (noemer == 0) {
            throw new IllegalArgumentException("mag geen 0 zijn");
        } else {
            this.noemer = noemer;
        }
    }

    @Override
    public String toString() {
        return teller + " / " + noemer;
    }
}
