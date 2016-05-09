package bd;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Alumno;

public class Db4o implements Modelo {

    private ObjectContainer bdoo;
    private final String FICHERODB4O = "exaprgfinal7.db4o";

    private void conectar() {
        bdoo = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),
          FICHERODB4O);
        System.out.println("BDOO Connexión establecida");
    }

    private void desconectar() {
        boolean closed = bdoo.close();
        System.out.println("BDOO conexión cerrada");

    }

    @Override
    public void createAlumnos(ArrayList<Alumno> alumnos) {

        Alumno alumno;

        conectar();
        Iterator it = alumnos.iterator();
        while (it.hasNext()) {
            alumno = (Alumno) it.next();
            bdoo.store(alumno);
            System.out.println("Copiado alumno: " + alumno.getIda());
        }
        desconectar();

    }

    @Override
    public void inicializa() {
        File f = new File(FICHERODB4O);
        if (f.exists()) {
            f.delete();
        }
    }
}
