package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StacjaRowerowa stacja1 = new StacjaRowerowa(1, new ArrayList<>());
        StacjaRowerowa stacja2 = new StacjaRowerowa(2, new ArrayList<>());
        StacjaRowerowa stacja3 = new StacjaRowerowa(3, new ArrayList<>());

        Klient klient1 = new Klient("ASD0980980", 1000, 1098);

        String naKtorejStacji = "Podaj na której stacji jesteś";
        String idKlienta = "Podaj ID klienta jeśli jesteś nowym klientem wpisz 0";
        String opcja1 = "[0] Wypozyczenie roweru";
        List<StacjaRowerowa> listaStacji = new ArrayList<>();
        listaStacji.add(stacja1);
        listaStacji.add(stacja2);
        listaStacji.add(stacja3);

        Scanner scanner = new Scanner(System.in);



        while(true) {
            System.out.println(naKtorejStacji);
            int nr_stacji = scanner.nextInt();

            System.out.println(idKlienta);
            int id_klienta = scanner.nextInt();

            int opcje;
            if(id_klienta != 0) {
                opcje = scanner.nextInt();
                // wyswietlic menu
                switch(opcje) {

                    case 1: {
                        //wyswietlenie rowerow z konkretnej stacji
                        listaStacji.get(nr_stacji).wyswietlRowery(false);
                        break;
                    }

                    case 2: {
                        //wypozyczenie rowerow
                        //wczytac id roweru
                        //zmienic dostepnosc roweru

                        break;
                    }


                }
            }



        }
    }
}
