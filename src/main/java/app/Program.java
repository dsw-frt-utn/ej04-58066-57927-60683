package app;

import data.Persistencia;
import domain.VehiculoTipo;
import java.util.InvalidPropertiesFormatException;
import views.ListarVehiculosView;
import views.MainMenu;

public class Program {
    public static void main(String[] args) {
        Persistencia.inicializar();
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
    }
}
