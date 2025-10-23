public class Camion extends Vehiculo{
    
    private int capacidadCarga;

    public Camion(String patente, String marca, int capacidad, int capacidadCarga) {
        super(patente, marca, capacidad);
        this.capacidadCarga = capacidadCarga;
    }

    public String mostrarDatos() {
        return "Camion " + marca + 
        " - Carga: " +
         capacidadCarga + " toneladas.";
    }
}
