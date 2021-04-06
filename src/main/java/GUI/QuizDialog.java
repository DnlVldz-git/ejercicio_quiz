/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author dani
 */
public class QuizDialog extends JDialog {

    private JPanel pnl;
    private JPanel pnl2;
    private JPanel pnl3;    
    private JLabel lblEnunciado;
    private JLabel lblOpcion1;
    private JLabel lblOpcion2;
    private JLabel lblOpcion3;
    private JLabel lblOpcion4;
    private ButtonGroup group;
    private JRadioButton rBtnOpcion1;
    private JRadioButton rBtnOpcion2;
    private JRadioButton rBtnOpcion3;
    private JRadioButton rBtnOpcion4;
    private JButton btnSiguiente;

    public QuizDialog(JFrame frame) {
        super.setSize(300, 330);
        super.setLocationRelativeTo(frame);

        this.pnl = new JPanel();  
        this.pnl2 = new JPanel();
        this.pnl3 = new JPanel();        
        this.lblEnunciado = new JLabel();
        this.lblOpcion1 = new JLabel();
        this.lblOpcion2 = new JLabel();
        this.lblOpcion3 = new JLabel();
        this.lblOpcion4 = new JLabel();

        group = new ButtonGroup();
        rBtnOpcion1 = new JRadioButton();
        rBtnOpcion2 = new JRadioButton();
        rBtnOpcion3 = new JRadioButton();
        rBtnOpcion4 = new JRadioButton();
        group.add(rBtnOpcion1);
        group.add(rBtnOpcion2);
        group.add(rBtnOpcion3);
        group.add(rBtnOpcion4);                

        btnSiguiente = new JButton("Siguiente");
        
        pnl.add(this.lblEnunciado);
        pnl2.add(this.lblOpcion1);
        pnl2.add(this.rBtnOpcion1);
        pnl2.add(this.lblOpcion2);
        pnl2.add(this.rBtnOpcion2);
        pnl2.add(this.lblOpcion3);
        pnl2.add(this.rBtnOpcion3);
        pnl2.add(this.lblOpcion4);
        pnl2.add(this.rBtnOpcion4);
        pnl3.add(this.btnSiguiente);

        add(pnl, BorderLayout.NORTH);
        add(pnl2, BorderLayout.CENTER);
        add(pnl3, BorderLayout.SOUTH);
    }

    public void setLblEnunciado(String lblEnunciado) {
        this.lblEnunciado.setText(lblEnunciado);
    }

    public void setLblOpcion1(String lblOpcion1) {
        this.lblOpcion1.setText(lblOpcion1);
    }

    public void setLblOpcion2(String lblOpcion2) {
        this.lblOpcion2.setText(lblOpcion2);
    }

    public void setLblOpcion3(String lblOpcion3) {
        this.lblOpcion3.setText(lblOpcion3);
    }

    public void setLblOpcion4(String lblOpcion4) {
        this.lblOpcion4.setText(lblOpcion4);
    }

    public JRadioButton getrBtnOpcion1() {
        return rBtnOpcion1;
    }

    public JRadioButton getrBtnOpcion2() {
        return rBtnOpcion2;
    }

    public JRadioButton getrBtnOpcion3() {
        return rBtnOpcion3;
    }

    public JRadioButton getrBtnOpcion4() {
        return rBtnOpcion4;
    }

    public JButton getBtnSiguiente() {
        return btnSiguiente;
    }
    
    public void limpiarSeleccion(){
        group.clearSelection();
    }
    
    
}
