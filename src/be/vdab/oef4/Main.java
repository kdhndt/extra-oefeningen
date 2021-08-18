package be.vdab.oef4;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var gebouw1 = new Gebouw(BigDecimal.valueOf(800));
        var gebouw2 = new Gebouw(BigDecimal.valueOf(1000));
        var instructeur1 = new Instructeur(BigDecimal.valueOf(1900), BigDecimal.valueOf(15), 7);
        var instructeur2 = new Instructeur(BigDecimal.valueOf(2100), BigDecimal.valueOf(18), 7);

        var array = new Kost[4];
        array[0] = gebouw1;
        array[1] = gebouw2;
        array[2] = instructeur1;
        array[3] = instructeur2;

        var totaal = BigDecimal.ZERO;

        for (var element : array) {
            totaal = totaal.add(element.getKost());
            // niet vergeten "totaal =" ervoor te zetten
        }
        System.out.println(totaal);
    }
}
