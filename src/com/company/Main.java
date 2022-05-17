package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StacjaRowerowa stacja1 = new StacjaRowerowa(0, new ArrayList<>());
        StacjaRowerowa stacja2 = new StacjaRowerowa(1, new ArrayList<>());
        StacjaRowerowa stacja3 = new StacjaRowerowa(2, new ArrayList<>());

        Klient klient1 = new Klient("ASD0980980", 1000, 0);

        Rower rower1 = new Rower(0, "Stihl", "Damka", 2000, true, 300, true);
        Rower rower2 = new Rower(1, "Stihl2", "Damka", 2000, true, 300, true);
        Rower rower3 = new Rower(2, "Stihl3", "Nie Damka", 2003, true, 300, true);
        Rower rower4 = new Rower(3, "Stihl4", "Damka", 2000, true, 300, true);
        Rower rower5 = new Rower(4, "Stihl5", "Nie Damka", 2010, true, 500, false);
        Rower rower6 = new Rower(5, "Stihl6", "Damka", 2000, true, 300, true);

        Lista_klientow lista_klientow = new Lista_klientow();
        lista_klientow.dodajOsobe(klient1);

        List<StacjaRowerowa> listaStacji = new ArrayList<>();
        listaStacji.add(stacja1);
        listaStacji.add(stacja2);
        listaStacji.add(stacja3);

        stacja1.dodajRower(rower1);
        stacja1.dodajRower(rower2);
        stacja1.dodajRower(rower3);
        stacja2.dodajRower(rower4);
        stacja2.dodajRower(rower5);
        stacja3.dodajRower(rower6);

        String naKtorejStacji = "Podaj na ktorej stacji jestes";
        String podajId = "Podaj ID klienta";
        String opcja1 = "[0] Wypozyczenie roweru";
        String opcja2 = "[1] Oddanie roweru";
        String opcja3 = "[2] Wyswietlenie rowerow";
        String opcja4 = "[5] Zakoncz dzialanie programu";

        Lista_wypozyczen lista_wypozyczen = new Lista_wypozyczen();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(naKtorejStacji);
            int nr_stacji = scanner.nextInt();
            System.out.println(nr_stacji);

            System.out.println(podajId);
            int id_klienta = scanner.nextInt();
            Klient klient = lista_klientow.wyszukajPoId(id_klienta);
            System.out.println(id_klienta);

            System.out.println("----------------------");
            int opcje;
            System.out.println(opcja1);
            System.out.println(opcja2);
            System.out.println(opcja3);
            System.out.println(opcja4);
            System.out.println("----------------------");
            opcje = scanner.nextInt();

            System.out.println();

            Wypozyczenie wypozyczenie = new Wypozyczenie();
            Platnosc platnosc = new Platnosc();

            // wyswietlic menu
            switch (opcje) {
                case 0 -> {
                    System.out.println("Podaj id roweru");
                    int id = scanner.nextInt();

                    System.out.println("Wybierz rodzaj platnosci (true - z gory 100zl/false - z dolu liczone 1.20 zl/km)");
                    boolean rodzajPlatnosci = scanner.nextBoolean();

                    System.out.println("Wybierz metode platności (true - karta/ false - gotowka)");
                    boolean metodaPlatnosci = scanner.nextBoolean();

                    Rower rower = listaStacji.get(nr_stacji).wyszukajRower(id);

                    platnosc.setWartosc(100);
                    platnosc.setMetoda_platnosci(metodaPlatnosci);
                    platnosc.setRodzaj_platnosci(rodzajPlatnosci);

                    wypozyczenie.setData_wypozyczenia(LocalDateTime.now().toString());
                    wypozyczenie.setData_zwrotu("2022-05-22 16:00:00");

                    lista_wypozyczen.dodajWypozyczenie(wypozyczenie);

                    wypozyczenie.wypozycz(rower, platnosc, klient);
                    System.out.println("Wypozyczono rower!");
                }

                case 1 -> {
                    //wypozyczenie rowerow
                    //wczytac id roweru
                    //zmienic dostepnosc roweru
                    System.out.println("Podaj id roweru");
                    int id = scanner.nextInt();
                    Rower rower = listaStacji.get(nr_stacji).wyszukajRower(id);

                    wypozyczenie.zwroc(rower, platnosc, klient, 24);
                    System.out.println("Zwrocono rower!");
                    break;
                }

                case 2 -> {
                    //wyswietlenie rowerow z konkretnej stacji
                    listaStacji.get(nr_stacji).wyswietlRowery();
                    break;
                }

                case 5 -> {
                    System.out.println("Program zakonczony");
                    return;
                }

                default -> {
                    System.out.println("Nie ma takiej opcji!!!");
                    break;
                }

            }


        }
    }
}
