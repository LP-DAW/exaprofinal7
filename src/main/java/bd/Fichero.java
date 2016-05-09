package bd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;
import modelo.Grupo;

/**
 *
 * @author Paco Aldarias<paco.aldarias@ceedcv.es>
 * @date
 */
public class Fichero implements Modelo {

    private final String FALUMNO = "alumno.cvs";
    private final String FGRUPO = "grupo.cvs";

    @Override
    public void createAlumnos(ArrayList<Alumno> alumnos) {

        FileWriter f = null;

        try {
            Iterator it = alumnos.iterator();
            Alumno alumno;
            Grupo grupo;
            f = new FileWriter(FALUMNO, true);
            while (it.hasNext()) {
                alumno = (Alumno) it.next();
                f.write(alumno.getIda()
                  + ";" + alumno.getNoma()
                  + ";" + alumno.getGrupo().getIdg() + "\r\n");

                grupo = alumno.getGrupo();

                if (readGrupo(grupo.getIdg()) == null) {
                    createGrupo(grupo);
                }

            }
        } catch (IOException ex) {

        } finally {
            try {
                f.close();
            } catch (IOException ex) {

            }
        }
    }

    @Override
    public void inicializa() {

        File f = new File(FALUMNO);
        if (f.exists()) {
            f.delete();
        }
        f = new File(FGRUPO);
        if (f.exists()) {
            f.delete();
        }
    }

    private void createGrupo(Grupo grupo) {

        FileWriter f = null;

        try {
            f = new FileWriter(FGRUPO, true);
            f.write(grupo.getIdg()
              + ";" + grupo.getNomg()
              + "\r\n");

        } catch (IOException ex) {

        } finally {
            try {
                f.close();
            } catch (IOException ex) {

            }
        }
    }

    public Grupo readGrupo(String id) {

        /* Rellenar.  0.5 puntos
         Graba el objeto examen en el fichero fexamen
         */
        Grupo grupo = null;
        Boolean encontrado = false;

        try {
            FileReader fr = new FileReader(FGRUPO);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            linea = br.readLine();
            while (linea != null) {
                grupo = extraeGrupo(linea);
                if (id.equals(grupo.getIdg())) {
                    encontrado = true;
                    break;
                }

                linea = br.readLine();
            }
            fr.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

        if (!encontrado) {
            grupo = null;
        }
        return grupo;
    }

    private Grupo extraeGrupo(String linea) {

        Grupo grupo;
        StringTokenizer str = new StringTokenizer(linea, ";");

        String idg = str.nextToken();
        String nomg = str.nextToken();

        grupo = new Grupo(idg, nomg);
        return grupo;
    }
}
