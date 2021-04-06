/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Func.Controller;
import Func.Quiz;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dani
 */
public class ResponderDialog extends JDialog{
    private JPanel pnl;
    private JLabel lbl1;
    private JComboBox cmbBx;
    private JButton btnAceptar;
    private JButton btnCancelar;
    
    public ResponderDialog(JFrame frame){
        super.setSize(300, 250);
        super.setLocationRelativeTo(frame);
        
        this.pnl = new JPanel();
        this.lbl1 = new JLabel("Elige el examen");
        this.cmbBx = new JComboBox();        
        this.btnAceptar = new JButton("Aceptar");
        this.btnCancelar = new JButton("Cancelar");
        
        pnl.add(this.lbl1);
        pnl.add(this.cmbBx);
        pnl.add(this.btnAceptar);
        pnl.add(this.btnCancelar);
        
        add(pnl);
    }

    public JComboBox getCmbBx() {                
        return cmbBx;
    }
    
    public int getComboBoxIndex(){             
        return cmbBx.getSelectedIndex();
    }
    
    public void cleanCombo(){
        cmbBx.removeAllItems();
    }
    
    public void fillCombo(ArrayList<Quiz> preguntas){
        for (Quiz pregunta : preguntas) {
            cmbBx.addItem(pregunta.getNombre()+" Materia: "+pregunta.getAsignatura());
        }
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }
    
    
}
