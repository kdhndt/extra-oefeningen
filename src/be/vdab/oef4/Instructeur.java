package be.vdab.oef4;

import java.math.BigDecimal;

public class Instructeur implements Kost, Opbrengst {

    private BigDecimal maandwedde;
    private BigDecimal uurPrijsPerLes;
    private int aantalUrenLesAanWerknemers;

    public Instructeur(BigDecimal maandwedde, BigDecimal uurPrijsPerLes, int aantalUrenLesAanWerknemers) {
        this.maandwedde = maandwedde;
        this.uurPrijsPerLes = uurPrijsPerLes;
        this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
    }

    @Override
    public BigDecimal getKost() {
        return maandwedde;
    }

    @Override
    public BigDecimal getOpbrengst() {
        return uurPrijsPerLes.multiply(BigDecimal.valueOf(aantalUrenLesAanWerknemers));
    }
}
