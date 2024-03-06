package es2.entities;

public class Chiamata {
    private double durata;
    private int numeroChiamato;

    public Chiamata(double durata, int numeroChiamato) {
        this.durata = durata;
        this.numeroChiamato = numeroChiamato;
    }

    public double getDurata() {
        return durata;
    }

    public int getNumeroChiamato() {
        return numeroChiamato;
    }
}
