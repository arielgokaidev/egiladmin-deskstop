package models;

public class Reserva {
    
    private int id;
    private int idValorTurno;
    private String residenteRut;
    private String numeroDepartamento;
    private String usuarioRut;
    private String fecha;
    private String turno;
    
    private Reserva() {}

    public Reserva(int id, int idValorTurno, String residenteRut, String numeroDepartamento, String usuarioRut, String fecha, String turno) {
        this.id = id;
        this.idValorTurno = idValorTurno;
        this.residenteRut = residenteRut;
        this.numeroDepartamento = numeroDepartamento;
        this.usuarioRut = usuarioRut;
        this.fecha = fecha;
        this.turno = turno;
    }

    public Reserva(int idreservasala, String residenterut, String departamentonumerodpto, String usuariointernorut, String fechareserva, int valorturno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Reserva(int idreservasala, String residenterut, String departamentonumerodpto, String usuariointernorut, String fechareserva, int valorturno, String turno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdValorTurno() {
        return idValorTurno;
    }

    public void setIdValorTurno(int idValorTurno) {
        this.idValorTurno = idValorTurno;
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
}
