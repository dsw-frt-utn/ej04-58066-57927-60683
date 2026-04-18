package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.Menu;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
