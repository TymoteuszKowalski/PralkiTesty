package org.example;

public class Plecak {

    private String zawartosc;

    public Plecak(String zawartosc) {
        this.zawartosc = zawartosc;
    }

    public String zawartoscKomory1() {
        int half = zawartosc.length() / 2;
        return zawartosc.substring(0, half);
    }

    public String zawartoscKomory2() {
        int half = zawartosc.length() / 2;
        return zawartosc.substring(half);
    }
    
    public char zleSpakowanyElement1() {
        String k1 = zawartoscKomory1();
        String k2 = zawartoscKomory2();
        for (char z1 : k1.toCharArray()) {
            for (char z2 : k2.toCharArray()) {
                if (z1 == z2) return z1;
            }
        }
        return ' ';
    }

    public int priorytetElementu(char z) {
        if (z >= 'a' && z <= 'z') {
            return z - 'a' + 1;
        }
        if (z >= 'A' && z <= 'Z') {
            return z - 'A' + 27;
        }
        return 0;

    }

}
 
