package controlador;

import bd.Modelo;
import vista.Vista;

/**
 *
 * @author Paco Aldarias<paco.aldarias@ceedcv.es>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Modelo modelo = null;
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

    }

}
