package models;

public class Estado {
    
    private int id;
    private String residenteRut;
    private String numeroDepartamento;
    private int tipoEstado;
    private int restriccion;
    private String fechaIngreso;
    private String fechaSalida;
    
    public Estado() {}

    public Estado(int id, String residenteRut, String numeroDepartamento, int tipoEstado, int restriccion, String fechaIngreso, String fechaSalida) {
        this.id = id;
        this.residenteRut = residenteRut;
        this.numeroDepartamento = numeroDepartamento;
        this.tipoEstado = tipoEstado;
        this.restriccion = restriccion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResidenteRut() {
        return residenteRut;
    }

    public void setResidenteRut(String residenteRut) {
        this.residenteRut = residenteRut;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public int getTipoEstado() {
        return tipoEstado;
    }

    public void setTipoEstado(int tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
   
}
