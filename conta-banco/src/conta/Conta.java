package conta;

public class Conta {

    int numeroCliente;
    String agenciaCliente;
    String nomeCliente;
    float saldoCliente;

    //Construtor
    public Conta(int numeroCliente, String agenciaCliente, String nomeCliente, float saldoCliente) {
        this.numeroCliente = numeroCliente;
        this.agenciaCliente = agenciaCliente;
        this.nomeCliente = nomeCliente;
        this.saldoCliente = saldoCliente;
    }

    // Métodos setters
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setSaldoCliente(float saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    public void setAgenciaCliente(String agenciaCliente) {
        this.agenciaCliente = agenciaCliente;
    }

    // Métodos getters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public float getSaldoCliente() {
        return saldoCliente;
    }

    public String getAgenciaCliente() {
        return agenciaCliente;
    }
}
