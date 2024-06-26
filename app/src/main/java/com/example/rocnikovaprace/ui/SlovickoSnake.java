package com.example.rocnikovaprace.ui;

import java.io.Serializable;

public class SlovickoSnake implements Serializable {
    //Třída, díky které vytvářím objekty, které následně dávám yaml stringu (teda taková je momentálně myšlenka)
    public String nazev;
    public String obrazek;
    public Boolean jeToSlovicko;
    public String kategorie;
    public int poradi;
    public Integer cas;

    public Integer getCas() {
        return cas;
    }

    public void setCas(Integer cas) {
        this.cas = cas;
    }
    public SlovickoSnake(String nazev, String obrazek, Boolean jeToSlovicko, String kategorie, int poradi) {
        this.nazev = nazev;
        this.obrazek = obrazek;
        this.jeToSlovicko = jeToSlovicko;
        this.kategorie = kategorie;
        this.poradi = poradi;
        this.cas = null;
    }
    public SlovickoSnake(String nazev, String obrazek, Boolean jeToSlovicko, String kategorie, int poradi, Integer cas) {
        this(nazev, obrazek, jeToSlovicko, kategorie, poradi);
        this.cas = cas;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String getObrazek() {
        return obrazek;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }

    public Boolean getJeToSlovicko() {
        return jeToSlovicko;
    }

    public void setJeToSlovicko(Boolean jeToSlovicko) {
        this.jeToSlovicko = jeToSlovicko;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public int getPoradi() {
        return poradi;
    }

    public void setPoradi(int poradi) {
        this.poradi = poradi;
    }

    public SlovickoSnake() {
    }}

