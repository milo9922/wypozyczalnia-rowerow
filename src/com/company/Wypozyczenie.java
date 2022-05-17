package com.company;

public class Wypozyczenie {

    private String data_wypozyczenia;
    private String data_zwrotu;

    public Wypozyczenie() {
    }

    public void wypozycz(Rower rower, Platnosc platnosc, Klient klient) {
        //sposob platnosci i metodę
        if(rower.czyDostepny()) {
            if(platnosc.sprawdz_rodzaj_platnosci())
                if(platnosc.getWartosc() > 0 && platnosc.getWartosc() <= klient.getStan_konta()) {
                    platnosc.przyjmijPlatnosc(100, klient);
                } else {
                    platnosc.odrzucPlatnosc();
                    return;
                }
            rower.zmienDostepnosc();
            System.out.println("Wypożyczono rower");
        } else
            System.out.println("Rower nie jest dostępny!");
    }

    public void zwroc(Rower rower, Platnosc platnosc, Klient klient, int dystans) {
        if(!platnosc.sprawdz_rodzaj_platnosci()) {
            if(platnosc.getWartosc() > 0 && platnosc.getWartosc() <= klient.getStan_konta()) {
                platnosc.przyjmijPlatnosc(platnosc.obliczKwoteDoZaplaty(dystans), klient);
            } else
                platnosc.odrzucPlatnosc();
        }
        rower.zmienDostepnosc();
        System.out.println("Zwrocono rower!");
    }

    public void setData_wypozyczenia(String data_wypozyczenia) {
        this.data_wypozyczenia = data_wypozyczenia;
    }

    public void setData_zwrotu(String data_zwrotu) {
        this.data_zwrotu = data_zwrotu;
    }
}
