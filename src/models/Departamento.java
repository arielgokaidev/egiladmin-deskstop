package models;

public class Departamento {
    
    private String numero;
    private String torre;
    private int mt2;
    
    public Departamento() {}

    public Departamento(String numero, String torre, int mt2) {
        this.numero = numero;
        this.torre = torre;
        this.mt2 = mt2;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTorre() {
        return torre;
    }

    public void setTorre(String torre) {
        this.torre = torre;
    }

    public int getMt2() {
        return mt2;
    }

    public void setMt2(int mt2) {
        this.mt2 = mt2;
    }
    
}
