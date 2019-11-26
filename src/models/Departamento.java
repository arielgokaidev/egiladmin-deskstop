package models;

public class Departamento {
    
    private String numeroDepartamento;
    private String torre;
    private int mt2;
    private int numeroEstacionamiento;
    private int numeroBodega;
    
    public Departamento() {}

    public Departamento(String numeroDepartamento, String torre, int mt2, int numeroEstacionamiento, int numeroBodega) {
        this.numeroDepartamento = numeroDepartamento;
        this.torre = torre;
        this.mt2 = mt2;
        this.numeroEstacionamiento = numeroEstacionamiento;
        this.numeroBodega = numeroBodega;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
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
    
        public int getNumeroEstacionamiento() {
        return numeroEstacionamiento;
    }

    public void setNumeroEstacionamiento(int numeroEstacionamiento) {
        this.numeroEstacionamiento = numeroEstacionamiento;
    }

    public int getNumeroBodega() {
        return numeroBodega;
    }

    public void setNumeroBodega(int numeroBodega) {
        this.numeroBodega = numeroBodega;
    }
    
}
