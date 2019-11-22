package models;

public class Estacionamiento {
    
    private int numero;
    private String numeroDepartamento;
    private int mt2;
    
    public Estacionamiento() {}

    public Estacionamiento(int numero, String numeroDepartamento, int mt2) {
        this.numero = numero;
        this.numeroDepartamento = numeroDepartamento;
        this.mt2 = mt2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public int getMt2() {
        return mt2;
    }

    public void setMt2(int mt2) {
        this.mt2 = mt2;
    }
    
}
