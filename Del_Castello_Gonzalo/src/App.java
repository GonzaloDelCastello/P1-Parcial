public class App {
    public static void main(String[] args) throws Exception {
       EmpresaTransporte empresa1 = new EmpresaTransporte("Trasporte S. A.");
    
        Vehiculo auto1 = new Auto ("ABC123", "Toyota", 1500, 4);
        Vehiculo auto2 = new Auto ("XYZ789", "Honda", 1300, 1);
        Vehiculo auto3 = new Auto ("LMN456", "Ford", 1600, 4);
        Vehiculo camion1 = new Camion ("DEF456", "Volvo", 8000, 200);
        Vehiculo camion2 = new Camion ("GHI789", "Scania", 9000, 250);
        Vehiculo camion3 = new Camion ("JKL012", "Mercedes", 8500, 220);

        empresa1.agregarVehiculo(auto1);
        empresa1.agregarVehiculo(auto2);    
        empresa1.agregarVehiculo(auto3);
        empresa1.agregarVehiculo(camion1);
        empresa1.agregarVehiculo(camion2);
        empresa1.agregarVehiculo(camion3);

        empresa1.mostrarFlota();
        System.out.println("Capacidad total de la flota: " + empresa1.calcularCapacidadTotal());
        empresa1.ordenarPorCapacidad();
        System.out.println("Flota ordenada por capacidad: " );
        empresa1.mostrarFlota();
    }
}
