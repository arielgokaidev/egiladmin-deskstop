package models;

public class Reserva {
    
    private int id;
    private String residenteRut;
    private String numeroDepartamento;
    private String usuarioRut;
    private String fecha;
    private int valorTurno;
    private String turno;
    private String nombres;
    private String apellidos;
    
    private Reserva() {}

    public Reserva(int id, String residenteRut, String numeroDepartamento, String usuarioRut, String fecha, int valorTurno, String turno) {
        this.id = id;
        this.residenteRut = residenteRut;
        this.numeroDepartamento = numeroDepartamento;
        this.usuarioRut = usuarioRut;
        this.fecha = fecha;
        this.valorTurno = valorTurno;
        this.turno = turno;
    }

    public Reserva(int id, String residenteRut, String numeroDepartamento, String fecha, String turno, String nombres, String apellidos) {
        this.id = id;
        this.residenteRut = residenteRut;
        this.numeroDepartamento = numeroDepartamento;
        this.fecha = fecha;
        this.turno = turno;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Reserva(String fecha) {
        this.fecha = fecha;
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

    public String getUsuarioRut() {
        return usuarioRut;
    }

    public void setUsuarioRut(String usuarioRut) {
        this.usuarioRut = usuarioRut;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getValorTurno() {
        return valorTurno;
    }

    public void setValorTurno(int valorTurno) {
        this.valorTurno = valorTurno;
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
    
}
