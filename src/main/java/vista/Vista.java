/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Paco Aldarias<paco.aldarias@ceedcv.es>
 * @date
 */
public class Vista extends JFrame {

    private JButton jb1;
    private JButton jb2;
    private JButton jb3;
    private JPanel jp1;
    private JPanel jp2;
    private JLabel jl1;

    public Vista() {
        initComponentents();
    }

    private void initComponentents() {
        throw new RuntimeException("Implementar");
        
        setSize(500, 200); // Ancho, Alto
        setLocationRelativeTo(null);
        //setVisible(true);
        //pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra Aplicacion

    }

    public JButton getjb1() {
        return jb1;
    }

    public JButton getjb2() {
        return jb2;
    }

    public JButton getjb3() {
        return jb3;
    }

    public JLabel getjl1() {
        return jl1;
    }

}
