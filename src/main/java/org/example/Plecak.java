package org.example;

public class Plecak {
    private String zawartosc;

    public Plecak(String zawartosc) {
        this.zawartosc = zawartosc;
    }


    public String zawartoscKomory1() {
        return zawartosc.substring(0,zawartosc.length()/2);
    }
}
