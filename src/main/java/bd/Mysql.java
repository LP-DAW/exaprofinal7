package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Alumno;

/**
 *
 * @author Paco Aldarias<paco.aldarias@ceedcv.es>
 * @date
 */
public class Mysql implements Modelo {

    private final String BD = "exaprgfinal6";
    private final String USER = "alumno";
    private final String PASS = "alumno";
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    @Override
    public void createAlumnos(ArrayList<Alumno> alumnos) {
        int resultado;
        Alumno alumno;
        String sql;
        String ida = null;

        try {
            conectar();
            st = con.createStatement();

            Iterator it = alumnos.iterator();

            while (it.hasNext()) {
                alumno = (Alumno) it.next();

                ida = alumno.getIda();
                String noma = alumno.getNoma();
                String idg = alumno.getGrupo().getIdg();
                String nomg = alumno.getGrupo().getNomg();

                sql = "insert into alumno(ida,noma,idg) "
                  + "values('" + ida + "','"
                  + noma + "','" + idg + "')";
                System.out.println(sql);
                resultado = st.executeUpdate(sql);

                sql = "insert into grupo (idg,nomg) "
                  + "values('" + idg + "','" + nomg + "')";
                System.out.println(sql);
                resultado = st.executeUpdate(sql);
            }

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error en " + ida);
        }
    }

    @Override
    public void inicializa() {

        try {
            conectar();
            st = con.createStatement();
            String sql = "delete from alumno;";
            System.out.println(sql);
            st.executeUpdate(sql);
            sql = "delete from grupo;";
            System.out.println(sql);
            st.executeUpdate(sql);

            desconectar();
        } catch (SQLException ex) {

        }

    }

    public void desconectar() {

        try {
            System.out.println("BDR Mysql Connexión cerrada");
            con.close();
        } catch (SQLException ex) {

        }
    }

    public void conectar() {

        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver).newInstance();
            String jdbcUrl = "jdbc:mysql://localhost:3306/" + BD;
            con = (Connection) DriverManager.getConnection(jdbcUrl,
              USER, PASS);

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
