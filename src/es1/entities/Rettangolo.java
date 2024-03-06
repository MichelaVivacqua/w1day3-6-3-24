package es1.entities;



public class Rettangolo {
    double base;
    double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }

    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();
        System.out.println("\nRettangolo 2:");
        rettangolo2.stampaRettangolo();
        double sommaAree = rettangolo1.calcolaArea() + rettangolo2.calcolaArea();
        double sommaPerimetri = rettangolo1.calcolaPerimetro() + rettangolo2.calcolaPerimetro();
        System.out.println("\nSomma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
