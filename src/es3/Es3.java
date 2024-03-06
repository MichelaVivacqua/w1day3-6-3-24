package es3;
import es3.entities.Articolo;
import es3.entities.cliente;

public class Es3 {
    public static void main(String[] args) {

        Articolo prodotto1 = new Articolo(44, "Patatine fritte", 4, 12);
        System.out.println("Codice articolo: " + prodotto1.getCodiceArticolo());
        System.out.println("Descrizione: " + prodotto1.getDescrizione());
        System.out.println("Prezzo: " + prodotto1.getPrezzo() + " euro" );
        System.out.println("Numero di pezzi disponibili: " + prodotto1.getNumeroPezzi());

        cliente cliente1 = new cliente(1, "Michela Vivacqua", "vivacquamichela@mail.com","06/03");
        System.out.println("Codice cliente: " + cliente1.getCodicecliente());
        System.out.println("Nome e Cognome: " + cliente1.getNomeECognome() );
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Data iscrizione: " + cliente1.getDataIscrizione());




    }
}
