package com.company;

public class Platnosc {

    private double wartosc;
    private boolean metoda_platnosci;

    // true dla platnosci z dolu
    // false dla platnosci z gory
    private boolean rodzaj_platnosci;

    public Platnosc() {
    }

    public Platnosc(double wartosc, boolean metoda_platnosci, boolean rodzaj_platnosci) {
        this.wartosc = wartosc;
        this.metoda_platnosci = metoda_platnosci;
        this.rodzaj_platnosci = rodzaj_platnosci;
    }

    public void przyjmijPlatnosc(double kwota, Klient klient) {
        klient.setStan_konta(klient.getStan_konta() - kwota);
    }

    public void odrzucPlatnosc() {
        System.out.println("Odrzucono Platnosc!");
    }

    public boolean sprawdz_rodzaj_platnosci() {
        return rodzaj_platnosci;
    }

    public double getWartosc() {
        return wartosc;
    }

    public double obliczKwoteDoZaplaty(int km) {
        return km * 1.2;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public boolean isMetoda_platnosci() {
        return metoda_platnosci;
    }

    public void setMetoda_platnosci(boolean metoda_platnosci) {
        this.metoda_platnosci = metoda_platnosci;
    }

    public boolean isRodzaj_platnosci() {
        return rodzaj_platnosci;
    }

    public void setRodzaj_platnosci(boolean rodzaj_platnosci) {
        this.rodzaj_platnosci = rodzaj_platnosci;
    }
}
