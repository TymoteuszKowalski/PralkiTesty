package org.example;

public class Plecak {
    private String zawartosc;

    public Plecak(String zawartosc) {
        this.zawartosc = zawartosc;
    }


    public String zawartoscKomory1() {
        return zawartosc.substring(0,zawartosc.length()/2);
    }

    public String zawartoscKomory2() {
        return zawartosc.substring(0,zawartosc.length()/2);
    }

    public char zleSpakowanyElement1() {
        String k1 = zawartoscKomory1();
        String k2 = zawartoscKomory2();

        for (char z1:k1.toCharArray()) {
            for (char z2:k2.toCharArray()) {
                if (z1 == z2) return z1;
            }
        }

        return ' ';
    }

    public int priorytetElementu(char z){
        //TODO

        return 3;
    }
}
