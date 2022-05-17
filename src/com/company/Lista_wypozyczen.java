package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lista_wypozyczen {

    private List<Wypozyczenie> liczba_wypozyczen = new ArrayList<>();

    public void dodajWypozyczenie(Wypozyczenie wypozyczenie) {
        liczba_wypozyczen.add(wypozyczenie);
    }

}
