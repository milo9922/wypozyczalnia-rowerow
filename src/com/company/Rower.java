package com.company;

public class Rower {

    private int numer_identyfikacyjny;
    private String marka;
    private String model;
    private int rok_produkcji;
    private boolean dostepnosc;
    private int przebieg;
    private boolean stan_roweru;

    public int getNumer_identyfikacyjny() {
        return numer_identyfikacyjny;
    }

    public String pokazRower() {
        return "Rower{" +
                "numer_identyfikacyjny=" + numer_identyfikacyjny +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok_produkcji=" + rok_produkcji +
                ", dostepnosc=" + dostepnosc +
                ", przebieg=" + przebieg +
                ", stan_roweru=" + stan_roweru +
                '}';
    }

    public boolean czyDostepny() {
        return dostepnosc;
    }

    public void zmienDostepnosc() {
        dostepnosc = !dostepnosc;
    }

}
