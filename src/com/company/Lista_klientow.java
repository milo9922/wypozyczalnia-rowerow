package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lista_klientow {

    List<Klient> lista_klientow = new ArrayList<>();

    public void dodajOsobe(Klient klient) {
        lista_klientow.add(klient);
    }

    public void usunOsobe(Klient klient) {
        lista_klientow.remove(klient);
    }

    public Klient wyszukajPoId(int id) {
        for (int i = 0; i < lista_klientow.size(); i++) {
            if(lista_klientow.get(i).getId_klienta() == id)
                return lista_klientow.get(i);
        }
        System.out.println("Nie znaleziono klienta o podanym id!");
        return new Klient();
    }
}
