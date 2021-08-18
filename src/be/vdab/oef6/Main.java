package be.vdab.oef6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Geef teller:");
        var teller = sc.nextInt();
        try {
            System.out.println("Geef noemer:");
            var noemer = sc.nextInt();
            System.out.println(new Breuk(teller, noemer));
        } catch (IllegalArgumentException ex) {
            System.err.println(ex);
        }
    }
}
