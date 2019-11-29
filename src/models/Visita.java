package models;

public class Visita {
    
    private int id;
    private int idEstacionamiento;
    private String numeroDepartamento;
    private String autorizaResidente;
    private String fechaIngreso;
    private String fechaSalida;
    private String rut;
    private String nombres;
    private String apellidos;
    private String patente;
    
    public Visita() {}

    public Visita(int id, int idEstacionamiento, String numeroDepartamento, String autorizaResidente, String fechaIngreso, String fechaSalida, String rut, String nombres, String apellidos, String patente) {
        this.id = id;
        this.idEstacionamiento = idEstacionamiento;
        this.numeroDepartamento = numeroDepartamento;
        this.autorizaResidente = autorizaResidente;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.patente = patente;
    }

    public Visita(int idEstacionamiento, String numeroDepartamento, String fechaIngreso, String rut, String nombres, String apellidos, String patente) {
        this.idEstacionamiento = idEstacionamiento;
        this.numeroDepartamento = numeroDepartamento;
        this.fechaIngreso = fechaIngreso;
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.patente = patente;
    }  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    
      
}
