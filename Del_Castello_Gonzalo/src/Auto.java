public class Auto extends Vehiculo{
    
    private int cantidadPasajeros;

    public Auto(String patente, String marca, int capacidad, int cantidadPasajeros) {
        super(patente, marca, capacidad);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String mostrarDatos() {
        return "Auto " + marca + 
        " - Pasajeros: " +
         cantidadPasajeros + ".";
    }
}
