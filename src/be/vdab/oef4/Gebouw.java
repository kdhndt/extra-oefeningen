package be.vdab.oef4;

import java.math.BigDecimal;

public class Gebouw implements Kost {
    private BigDecimal huurprijs;

    public Gebouw(BigDecimal huurprijs) {
        this.huurprijs = huurprijs;
    }

    @Override
    public BigDecimal getKost() {
        return huurprijs;
    }
}
