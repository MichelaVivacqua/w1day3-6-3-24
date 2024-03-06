package es3.entities;

public class cliente {
    private int codicecliente;
    private String nomeECognome;
    private String email;

    public int getCodicecliente() {
        return codicecliente;
    }

    public String getNomeECognome() {
        return nomeECognome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataIscrizione() {
        return dataIscrizione;
    }

    private String dataIscrizione;

    public cliente(int codicecliente, String nomeECognome, String email, String dataIscrizione) {

        this.codicecliente = codicecliente;
        this.nomeECognome = nomeECognome;
        this.email= email;
        this.dataIscrizione=dataIscrizione;
    }
}
