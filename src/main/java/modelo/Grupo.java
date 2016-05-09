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
public class Grupo {

    private String idg;
    private String nomg;

    public Grupo(String idg, String nomg) {
        throw new RuntimeException("Implementar");

    }

    /**
     * @return the idg
     */
    public String getIdg() {
        return idg;
    }

    /**
     * @param idg the idg to set
     */
    public void setIdg(String idg) {
        this.idg = idg;
    }

    /**
     * @return the nomg
     */
    public String getNomg() {
        return nomg;
    }

    /**
     * @param nomg the nomg to set
     */
    public void setNomg(String nomg) {
        this.nomg = nomg;
    }

}
