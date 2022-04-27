package com.company;

import java.util.List;

public class Lista_osob {

    List<Osoba> lista_osob;

    public void dodajOsobe(Osoba osoba) {
        lista_osob.add(osoba);
    }

    public void usunOsobe(Osoba osoba) {
        lista_osob.remove(osoba);
    }
}
