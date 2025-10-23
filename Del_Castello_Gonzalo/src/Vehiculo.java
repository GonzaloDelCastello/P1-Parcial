public class Vehiculo {
    
    protected String patente;
    protected String marca;
    protected int capacidad;

    public Vehiculo(String patente, String marca, int capacidad) {
        this.patente = patente;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }
    public String getMarca() {
        return marca;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String mostrarDato() {
        return "Vehiculo " + marca + ", Patente " + patente +", capacidad: " + capacidad;
    }

    
}
