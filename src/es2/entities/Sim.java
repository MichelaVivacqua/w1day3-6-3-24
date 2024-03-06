package es2.entities;


import java.util.ArrayList;

public class Sim {
    private int numeroDiTelefono;
    private double credito;
    private ArrayList<Chiamata> chiamate;

    public Sim(int numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = 0;
        this.chiamate = new ArrayList<>();
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroDiTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime 5 chiamate effettuate:");
        for (Chiamata chiamata : chiamate) {
            System.out.println("- Durata: " + chiamata.getDurata() + " minuti, Numero chiamato: " + chiamata.getNumeroChiamato());
        }
    }


}
