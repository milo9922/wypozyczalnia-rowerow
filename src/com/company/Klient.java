package com.company;

public class Klient {

    private String numer_dowodu_osobistego;
    private double stan_konta;
    private int id_klienta;
    private int id_roweru;

    public Klient() {
    }

    public Klient(String numer_dowodu_osobistego, double stan_konta, int id_klienta) {
        this.numer_dowodu_osobistego = numer_dowodu_osobistego;
        this.stan_konta = stan_konta;
        this.id_klienta = id_klienta;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "numer_dowodu_osobistego='" + numer_dowodu_osobistego + '\'' +
                ", stan_konta=" + stan_konta +
                '}';
    }

    public double getStan_konta() {
        return stan_konta;
    }

    public void setStan_konta(double stan_konta) {
        this.stan_konta = stan_konta;
    }

    public int getId_klienta() {
        return id_klienta;
    }
}
