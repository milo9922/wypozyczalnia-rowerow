package com.company;

import java.util.List;

public class StacjaRowerowa {

    private int numer_stacji;
    private List<Rower> liczba_rowerow;

    public StacjaRowerowa(int numer_stacji, List<Rower> liczba_rowerow) {
        this.numer_stacji = numer_stacji;
        this.liczba_rowerow = liczba_rowerow;
    }

    public void dodajRower(Rower rower) {
        liczba_rowerow.add(rower);
    }

    public void usunRower(Rower rower) {
        liczba_rowerow.remove(rower);
    }

    public boolean sprawdzDostepnoscRoweru(Rower rower) {
        return liczba_rowerow.get(rower.getNumer_identyfikacyjny()).czyDostepny();
    }

    public void naprawRower(Rower rower) {
    }

    public Rower wyszukajRower(int numer_identyfikacyjny) {
        return liczba_rowerow.get(numer_identyfikacyjny);
    }

    public void edytujRower(Rower rower) {
    }

    public void wyswietlRowery(boolean czyTylkoDostepne) {
        if (czyTylkoDostepne) {
            //wyswietl dostepne rowery
        } else{
            //wyswietl wszystkie rowery
        }
    }
}
