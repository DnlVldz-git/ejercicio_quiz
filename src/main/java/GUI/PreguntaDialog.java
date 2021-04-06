/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Func.Quiz1Exception;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class PreguntaDialog extends JDialog{
    private JLabel lblEnunciado;
    private JLabel lblR1;
    private JLabel lblR2;
    private JLabel lblR3;
    private JLabel lblR4;
    private JTextField txtFldEnunciado;
    private JTextField txtFldR1;
    private JTextField txtFldR2;
    private JTextField txtFldR3;
    private JTextField txtFldR4;
    private ButtonGroup group;
    private JRadioButton btnR1;
    private JRadioButton btnR2;
    private JRadioButton btnR3;
    private JRadioButton btnR4;
    private JButton btnSiguiente;
    private JPanel pnl;
    private JFrame jf;
    
    public PreguntaDialog(JFrame frame){
        
        super.setSize(410, 320);
        super.setLocationRelativeTo(frame);
        
        this.lblEnunciado = new JLabel("Enunciado");
        this.lblR1 = new JLabel("Respuesta 1");
        this.lblR2 = new JLabel("Respuesta 2");
        this.lblR3 = new JLabel("Respuesta 3");
        this.lblR4 = new JLabel("Respuesta 4");
        this.txtFldEnunciado = new JTextField(30);
        this.txtFldR1 = new JTextField(30);
        this.txtFldR2 = new JTextField(30);
        this.txtFldR3 = new JTextField(30);
        this.txtFldR4 = new JTextField(30);
        this.btnR1 = new JRadioButton();
        this.btnR2 = new JRadioButton();
        this.btnR3 = new JRadioButton();
        this.btnR4 = new JRadioButton();
        this.btnSiguiente = new JButton("Siguiente");
        this.group = new ButtonGroup();
        
        this.pnl = new JPanel();       
        this.jf = new JFrame();
        this.jf.setAlwaysOnTop(true);
                
        group.add(btnR1);
        group.add(btnR2);
        group.add(btnR3);
        group.add(btnR4);
        
        pnl.add(this.lblEnunciado);
        pnl.add(this.txtFldEnunciado);
        pnl.add(this.lblR1);
        pnl.add(this.txtFldR1);
        pnl.add(this.btnR1);
        pnl.add(this.lblR2);
        pnl.add(this.txtFldR2);
        pnl.add(this.btnR2);
        pnl.add(this.lblR3);
        pnl.add(this.txtFldR3);
        pnl.add(this.btnR3);
        pnl.add(this.lblR4);
        pnl.add(this.txtFldR4);
        pnl.add(this.btnR4);
        pnl.add(this.btnSiguiente);
        
        add(this.pnl);                
    }
    
    public void limpiarSeleccion(){
        group.clearSelection();               
    }

    public String getTxtFldEnunciadoTxt() throws Quiz1Exception {
        if (txtFldEnunciado.getText().equals("")) {
            txtFldEnunciado.requestFocus();
            throw new Quiz1Exception("Introduzca un enunciado válido", jf);
        }else{
            return txtFldEnunciado.getText();
        }        
    }

    public String getTxtFldR1Txt() throws Quiz1Exception {
        if (txtFldR1.getText().equals("")) {
            txtFldR1.requestFocus();
            throw new Quiz1Exception("Introduzca la respuesta 1 correctamente", jf);
        }else{
            return txtFldR1.getText();
        }
    }

    public String getTxtFldR2Txt() throws Quiz1Exception {
        if (txtFldR2.getText().equals("")) {
            txtFldR2.requestFocus();
            throw new Quiz1Exception("Introduzca la respuesta 2 correctamente", jf);
        }else{
            return txtFldR2.getText();
        }
    }

    public String getTxtFldR3Txt() throws Quiz1Exception {
        if (txtFldR3.getText().equals("")) {
            txtFldR3.requestFocus();
            throw new Quiz1Exception("Introduzca la respuesta 3 correctamente", jf);
        }else{
            return txtFldR3.getText();
        }
    }

    public String getTxtFldR4Txt() throws Quiz1Exception {
        if (txtFldR4.getText().equals("")) {
            txtFldR4.requestFocus();
            throw new Quiz1Exception("Introduzca la respuesta 4 correctamente", jf);
        }else{
            return txtFldR4.getText();
        }
    }

    public JRadioButton getBtnR1() {
        return btnR1;
    }

    public JRadioButton getBtnR2() {
        return btnR2;
    }

    public JRadioButton getBtnR3() {
        return btnR3;
    }

    public JRadioButton getBtnR4() {
        return btnR4;
    }

    public JButton getBtnSiguiente() {
        return btnSiguiente;
    }
    
    public void clear(){
        this.txtFldEnunciado.setText("");
        this.txtFldR1.setText("");
        this.txtFldR2.setText("");
        this.txtFldR3.setText("");
        this.txtFldR4.setText("");
    }
    
}
