package models;

public class Restriccion {
    
    private int id;
    private String nombreRestriccion;
    
    public Restriccion() {}

    public Restriccion(int id, String nombreRestriccion) {
        this.id = id;
        this.nombreRestriccion = nombreRestriccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMombreRestriccion() {
        return nombreRestriccion;
    }

    public void setNombreRestriccion(String nombreRestriccion) {
        this.nombreRestriccion = nombreRestriccion;
    }
}
