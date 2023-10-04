package Principal;

public class Especialidad {
    private int idEspecialidad;
    private String tipo;

    public Especialidad(int idEspecialidad, String tipo) {
        this.idEspecialidad = idEspecialidad;
        this.tipo = tipo;
    }

    public Especialidad(String tipo) {
        this.tipo = tipo;
    }

    public Especialidad() {
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad= " + idEspecialidad + ", tipo= " + tipo + '}'+ "\n";
    }
    
    
}
