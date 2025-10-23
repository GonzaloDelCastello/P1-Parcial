public class EmpresaTransporte {
    
    private String nombre;
    private Vehiculo[] flota;
    private int cantidadVehiculos;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
        this.flota = new Vehiculo[100];
        this.cantidadVehiculos = 0;

    }

    public String getNombre() {
        return nombre;
    }

    public void agregarVehiculo(Vehiculo v) {
        for (int i = 0; i <= cantidadVehiculos; i++) {
            if (flota[i] == null) {
                flota[i] = v;
                cantidadVehiculos++;
                //System.out.println("Vehiculo patente " + v.getPatente() + " agragado a la flota" );
                return;
            }
        }
    }

    public void mostrarFlota() {
        System.out.println("Flota de la empresa " + nombre + ":");
        for (int i = 0; i < cantidadVehiculos; i++) {
            if (flota[i] != null) {
                System.out.println(flota[i].mostrarDato());
            }
        }
    }

    public int calcularCapacidadTotal() {
        int capacidadTotal = 0;
        for (int i = 0; i < cantidadVehiculos; i++) {
            if (flota[i] != null) {
                capacidadTotal += flota[i].getCapacidad();
            }
        }
        return capacidadTotal;
    }

    public Vehiculo[] ordenarPorCapacidad() {
        for (int i = 0; i < cantidadVehiculos - 1; i++) {
            for (int j = 0; j < cantidadVehiculos - i - 1; j++) {
                if (flota[j].getCapacidad() < flota[j + 1].getCapacidad()) {
                    Vehiculo temp = flota[j];
                    flota[j] = flota[j + 1];
                    flota[j + 1] = temp;
                }
            }
        }
        return flota;
    }

    // public Vehiculo[] buscarPorTipo(String tipo) {
    //     for (int i = 0; i < cantidadVehiculos; i++) {
    //         if (flota[i].)
    //     }
    // }
}
