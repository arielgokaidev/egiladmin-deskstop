package models;

public class Restriccion {
    
    private int id;
    private String restriccion;
    
    public Restriccion() {}

    public Restriccion(int id, String restriccion) {
        this.id = id;
        this.restriccion = restriccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(String restriccion) {
        this.restriccion = restriccion;
    }
}
