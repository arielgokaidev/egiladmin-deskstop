package models;

public class Residente {
    
    private String rut;
    private int idTipoResidente;
    private String nombres;
    private String apellidos;
    private String correo;
    private String numeroDepartamento;
    
    public Residente() {}

    public Residente(String rut, int idTipoResidente, String nombres, String apellidos, String correo) {
        this.rut = rut;
        this.idTipoResidente = idTipoResidente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }
    
    public Residente(String rut, String nombres, String apellidos, String numeroDepartamento) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDepartamento = numeroDepartamento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getIdTipoResidente() {
        return idTipoResidente;
    }

    public void setIdTipoResidente(int idTipoResidente) {
        this.idTipoResidente = idTipoResidente;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }
    
}
