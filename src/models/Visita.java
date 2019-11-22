package models;

public class Visita {
    
    private int id;
    private int valorEstacionamiento;
    private int idVisitaVehiculo;
    private String visitaRut;
    private String numeroDepartamento;
    private String autorizaResidente;
    private String observacion;
    private String fechaIngreso;
    private String fechaSalida;
    
    public Visita() {}

    public Visita(int id, int valorEstacionamiento, int idVisitaVehiculo, String visitaRut, String numeroDepartamento, String autorizaResidente, String observacion, String fechaIngreso, String fechaSalida) {
        this.id = id;
        this.valorEstacionamiento = valorEstacionamiento;
        this.idVisitaVehiculo = idVisitaVehiculo;
        this.visitaRut = visitaRut;
        this.numeroDepartamento = numeroDepartamento;
        this.autorizaResidente = autorizaResidente;
        this.observacion = observacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValorEstacionamiento() {
        return valorEstacionamiento;
    }

    public void setValorEstacionamiento(int valorEstacionamiento) {
        this.valorEstacionamiento = valorEstacionamiento;
    }

    public int getIdVisitaVehiculo() {
        return idVisitaVehiculo;
    }

    public void setIdVisitaVehiculo(int idVisitaVehiculo) {
        this.idVisitaVehiculo = idVisitaVehiculo;
    }

    public String getVisitaRut() {
        return visitaRut;
    }

    public void setVisitaRut(String visitaRut) {
        this.visitaRut = visitaRut;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public String getAutorizaResidente() {
        return autorizaResidente;
    }

    public void setAutorizaResidente(String autorizaResidente) {
        this.autorizaResidente = autorizaResidente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
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
