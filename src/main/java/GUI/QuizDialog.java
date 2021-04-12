/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
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
    private JPanel pnlP1;
    private JPanel pnlP2;
    private JPanel pnlP3;
    private JPanel pnlP4;
    private JLabel lblEnunciado;
    private JLabel lblOpcion1;
    private JLabel lblOpcion2;
    private JLabel lblOpcion3;
    private JLabel lblOpcion4;
    private JLabel lblNumeracion;
    private ButtonGroup group;
    private JRadioButton rBtnOpcion1;
    private JRadioButton rBtnOpcion2;
    private JRadioButton rBtnOpcion3;
    private JRadioButton rBtnOpcion4;
    private JButton btnSiguiente;
    private JButton btnAnterior;

    public QuizDialog(JFrame frame) {
        super.setSize(300, 330);
        super.setLocationRelativeTo(frame);

        this.pnl = new JPanel();  
        this.pnl2 = new JPanel();
        
        pnl2.setLayout(new BoxLayout(pnl2, BoxLayout.Y_AXIS));
        
        this.pnl3 = new JPanel();        
        this.lblEnunciado = new JLabel();
        this.lblOpcion1 = new JLabel();
        this.lblOpcion2 = new JLabel();
        this.lblOpcion3 = new JLabel();
        this.lblOpcion4 = new JLabel();
        this.lblNumeracion = new JLabel();
        
        this.pnlP1 = new JPanel();
        this.pnlP2 = new JPanel();
        this.pnlP3 = new JPanel();
        this.pnlP4 = new JPanel();                

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
        btnAnterior = new JButton ("Anterior");
        
        pnl.add(this.lblEnunciado);
        
        pnlP1.add(this.lblOpcion1);
        pnlP1.add(this.rBtnOpcion1);
        pnlP2.add(this.lblOpcion2);
        pnlP2.add(this.rBtnOpcion2);
        pnlP3.add(this.lblOpcion3);
        pnlP3.add(this.rBtnOpcion3);
        pnlP4.add(this.lblOpcion4);
        pnlP4.add(this.rBtnOpcion4);
        pnl3.add(this.btnAnterior);
        pnl3.add(this.lblNumeracion);
        pnl3.add(this.btnSiguiente);
                
        pnl2.add(pnlP1);
        pnl2.add(pnlP2);
        pnl2.add(pnlP3);
        pnl2.add(pnlP4);

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

    public JButton getBtnAnterior() {
        return btnAnterior;
    }

    public void setLblNumeracion(String num) {
        this.lblNumeracion.setText(num);
    }
    
    
    
}
