package be.vdab.oef3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var goeddoel = new GoedeDoel("GoedeDoelNaarKeuze");
        var sc = new Scanner(System.in);
        System.out.println("Voer getal in:");
        for (int getal; (getal = sc.nextInt()) != 0;) {
            goeddoel.toevoegen(getal);
        }
        System.out.println(goeddoel.getNaam() + " heeft een totaal gestort bedrag van: " + goeddoel.getTotaal());
    }
}
