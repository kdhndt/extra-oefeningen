package be.vdab.oef2;

public class Main {
    public static void main(String[] args) {
        var partij = new PolitiekePartij("PartijVanKeuze", 1);
        var politieker = new Politieker("John", "Doe", partij);
        System.out.println(politieker);
    }
}