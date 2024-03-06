import es1.entities.Rettangolo;

public class Es1 {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(5, 4);
        Rettangolo rettangolo2 = new Rettangolo(3, 6);

        System.out.println("Stampa dei rettangoli:");
        System.out.println("Rettangolo 1:");
        rettangolo1.stampaRettangolo();
        System.out.println("\nRettangolo 2:");
        rettangolo2.stampaRettangolo();

        System.out.println("\nStampa dei due rettangoli:");
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
