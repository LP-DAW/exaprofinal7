package bd;

import java.util.ArrayList;
import modelo.Alumno;

/**
 *
 * @author Paco Aldarias<paco.aldarias@ceedcv.es>
 */
public interface Modelo {

    // Graba en objeto examen en un fichero/mysql
    public void createAlumnos(ArrayList<Alumno> alumnos);

    // Borrar el contenido de los ficheros/tablas
    public void inicializa();

}
