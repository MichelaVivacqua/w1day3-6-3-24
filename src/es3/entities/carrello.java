package es3.entities;

public class carrello {


    private String clienteAssociato;
    private String elencoArticoli;
   private int totaleCostoArticoli;

    public String getClienteAssociato() {
        return clienteAssociato;
    }

    public String getElencoArticoli() {
        return elencoArticoli;
    }

    public int getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public carrello(String clienteAssociato, String elencoArticoli, int totaleCostoArticoli) {

        this.clienteAssociato=clienteAssociato;
        this.elencoArticoli=elencoArticoli;
        this.totaleCostoArticoli=totaleCostoArticoli;

    }
}
