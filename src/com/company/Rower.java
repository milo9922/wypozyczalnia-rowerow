package com.company;

public class Rower {

    private int numer_identyfikacyjny;
    private String marka;
    private String model;
    private int rok_produkcji;
    private boolean dostepnosc;
    private int przebieg;
    private boolean stan_roweru;

    public Rower(int numer_identyfikacyjny, String marka, String model, int rok_produkcji, boolean dostepnosc, int przebieg, boolean stan_roweru) {
        this.numer_identyfikacyjny = numer_identyfikacyjny;
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.dostepnosc = dostepnosc;
        this.przebieg = przebieg;
        this.stan_roweru = stan_roweru;
    }

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



    public void setStan_roweru(boolean stan_roweru) {
        this.stan_roweru = stan_roweru;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public boolean isStan_roweru() {
        return stan_roweru;
    }
}
