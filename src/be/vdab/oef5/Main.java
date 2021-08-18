package be.vdab.oef5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var woord = sc.next().toLowerCase();
        var omgekeerdWoord = new StringBuilder(woord).reverse();
        if (woord.equals(omgekeerdWoord.toString())) {
            System.out.println("Dit is een palindroom.");
        } else {
            System.out.println("Dit is geen palindroom.");
        }
    }
}