package views;

import data.Persistencia;
import domain.Marca;
import domain.Sucursal;
import domain.Vehiculo;
import domain.VehiculoCombustible;
import domain.VehiculoElectrico;
import domain.VehiculoTipo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class Controlador {
    //que?
    public static ArrayList<VehiculoViewModel> getVehiculos(){
        ArrayList<VehiculoViewModel> vehiculos = new ArrayList<>();
        for(Vehiculo vehiculo : Persistencia.getVehiculos()) {
            vehiculos.add(new VehiculoViewModel(vehiculo));
        }
        return vehiculos;
    }
    
    public static double[] calcularConsumos(Map<String, Double> vehiculos){
        double consumoElectricos = 0;
        double consumoCombustible= 0;
        for(Map.Entry<String, Double> entry : vehiculos.entrySet()){
           double consumo = 0;
           Optional<Vehiculo> vehiculo = Persistencia.getVehiculo(entry.getKey());
           if(vehiculo.isPresent()){
               consumo = vehiculo.get().calcularConsumo(entry.getValue());
               consumoElectricos += vehiculo.get().esDe(VehiculoTipo.ELECTRICO) ? consumo : 0;
               consumoCombustible += vehiculo.get().esDe(VehiculoTipo.COMBUSTIBLE) ? consumo : 0;
           }
        }
        return new double[] {consumoElectricos, consumoCombustible};
    }
    
    public static void agregarVehiculo(String patente, String nombreMarca, String paisMarca,
                                       String modelo, int anio, double capacidadCarga,
                                       String codigoSucursal, VehiculoTipo tipo,
                                       double kmPorLitroOKwh, double litrosExtra)
            throws IllegalArgumentException {

        if (patente == null || patente.isBlank()) {
            throw new IllegalArgumentException("La patente no puede estar vacía.");
        }
        if (nombreMarca == null || nombreMarca.isBlank()) {
            throw new IllegalArgumentException("El nombre de la marca no puede estar vacío.");
        }
        if (Persistencia.getVehiculo(patente).isPresent()) {
            throw new IllegalArgumentException("Ya existe un vehículo con la patente: " + patente);
        }

        Sucursal sucursal = Persistencia.getSucursales().stream()
                .filter(s -> s.getCodigo().equalsIgnoreCase(codigoSucursal))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Sucursal no encontrada: " + codigoSucursal));

        // Reutiliza una Marca existente o crea una nueva con el país ingresado
        Marca marca = Persistencia.getMarcas().stream()
                .filter(m -> m.getNombre().equalsIgnoreCase(nombreMarca))
                .findFirst()
                .orElseGet(() -> {
                    Marca nueva = new Marca(nombreMarca, paisMarca.isBlank() ? "Desconocido" : paisMarca);
                    Persistencia.agregarMarca(nueva);
                    return nueva;
                });

        Vehiculo nuevo;
        if (tipo == VehiculoTipo.ELECTRICO) {
            nuevo = new VehiculoElectrico(patente, marca, modelo, anio, capacidadCarga, sucursal, kmPorLitroOKwh);
        } else {
            nuevo = new VehiculoCombustible(patente, marca, modelo, anio, capacidadCarga, sucursal, kmPorLitroOKwh, litrosExtra);
        }

        Persistencia.agregarVehiculo(nuevo);
    }

}
