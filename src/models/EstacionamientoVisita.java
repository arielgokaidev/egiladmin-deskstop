package models;

public class EstacionamientoVisita {
    
    private int id;
    private int numero;
    private String estado;
    private int valor;
    
    public EstacionamientoVisita() {}

    public EstacionamientoVisita(int id, int numero, String estado, int valor) {
        this.id = id;
        this.numero = numero;
        this.estado = estado;
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
