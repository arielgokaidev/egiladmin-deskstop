package models;

public class Estado {
    
    private int id;
    private String usuarioRut;
    private String numeroDepartamento;
    private int idTipoEstado;
    private String fecha;
    private String observacion;
    private int restriccion;
    
    public Estado() {}

    public Estado(int id, String usuarioRut, String numeroDepartamento, int idTipoEstado, String fecha, String observacion, int restriccion) {
        this.id = id;
        this.usuarioRut = usuarioRut;
        this.numeroDepartamento = numeroDepartamento;
        this.idTipoEstado = idTipoEstado;
        this.fecha = fecha;
        this.observacion = observacion;
        this.restriccion = restriccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuarioRut() {
        return usuarioRut;
    }

    public void setUsuarioRut(String usuarioRut) {
        this.usuarioRut = usuarioRut;
    }

    public String getNumeroDepartamento() {
        return numeroDepartamento;
    }

    public void setNumeroDepartamento(String numeroDepartamento) {
        this.numeroDepartamento = numeroDepartamento;
    }

    public int getIdTipoEstado() {
        return idTipoEstado;
    }

    public void setIdTipoEstado(int idTipoEstado) {
        this.idTipoEstado = idTipoEstado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }
   
}
