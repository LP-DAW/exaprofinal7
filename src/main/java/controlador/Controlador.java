package controlador;

import bd.Db4o;
import bd.Modelo;
import bd.Mysql;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Alumno;
import modelo.Grupo;
import vista.Vista;

/**
 *
 * @author Paco Aldarias<paco.aldarias@ceedcv.es>
 * @date
 */
public class Controlador implements ActionListener {

    final static String DB4O = "Db4o";
    final static String MYSQL = "Mysql";
    final static String SALIR = "Salir";

    private Modelo modelo;
    private Vista vista;
    private ArrayList<Alumno> alumnos;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        inicializaobjetos();
        inicializabotones();
        mostrarTexto("Pulsar un botón");
        vista.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        throw new RuntimeException("Implementar");


    }

    private void salir() {
        System.exit(0);
        vista.dispose();
    }

    private void db4o() {
        throw new RuntimeException("Implementar");

    }

    private void mysql() {
        throw new RuntimeException("Implementar");

    }

    private void inicializaobjetos() {

        throw new RuntimeException("Implementar");


    }

    private void inicializabotones() {

        throw new RuntimeException("Implementar");


    }

    private void mostrarTexto(String texto) {
        vista.getjl1().setText(texto);
    }

}
