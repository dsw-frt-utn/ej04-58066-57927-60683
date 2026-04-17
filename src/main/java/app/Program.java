package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.AgregarVehiculo;
import views.ListarVehiculosView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        ListarVehiculosView view = new ListarVehiculosView();
        AgregarVehiculo view2 = new AgregarVehiculo();
        view.setVisible(true);
        view2.setVisible(true);
    }
}
