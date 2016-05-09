/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Paco Aldarias<paco.aldarias@ceedcv.es>
 * @date
 */
public class Alumno {

    private String ida;
    private String noma;
    private Grupo grupo;

    public Alumno(String ida, String noma, Grupo grupo) {
        throw new RuntimeException("Implementar");

    }

    /**
     * @return the ida
     */
    public String getIda() {
        return ida;
    }

    /**
     * @param ida the ida to set
     */
    public void setIda(String ida) {
        this.ida = ida;
    }

    /**
     * @return the noma
     */
    public String getNoma() {
        return noma;
    }

    /**
     * @param noma the noma to set
     */
    public void setNoma(String noma) {
        this.noma = noma;
    }

    /**
     * @return the grupo
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
