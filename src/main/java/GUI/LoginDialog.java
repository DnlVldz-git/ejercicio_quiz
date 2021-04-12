/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Func.Quiz1Exception;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author dani
 */
public class LoginDialog extends JPanel{
    private JPanel pnl;
    private JLabel lblUsuario;
    private JLabel lblContraseña;
    private JTextField fldUsuario;
    private JPasswordField fldContraseña;
    private JButton btnAceptar;
    private JFrame jf;
    
    public LoginDialog(){
        super.setSize(500, 330);
        super.setLayout(new FlowLayout());               
                
        this.pnl = new JPanel();
        pnl.setSize(400,400);
        this.lblUsuario = new JLabel("Usuario");
        this.lblContraseña = new JLabel("Contraseña");
        this.fldContraseña = new JPasswordField(15);
        this.fldUsuario = new JTextField(15);
        this.btnAceptar = new JButton("Aceptar");
        
        this.jf = new JFrame();
        this.jf.setAlwaysOnTop(true);
        
        pnl.add(lblUsuario);
        pnl.add(fldUsuario);
        pnl.add(lblContraseña);
        pnl.add(fldContraseña);
        pnl.add(btnAceptar);
        
        add(pnl);        
    }

    public String getFldUsuario() throws Quiz1Exception {
        if (fldUsuario.getText().equals("")) {
            fldUsuario.requestFocus();
            throw new Quiz1Exception("Usuario no válido", jf);
        }else{
            return fldUsuario.getText();
        }        
    }

    public String getFldContraseña() throws Quiz1Exception {
        if (String.copyValueOf(fldContraseña.getPassword()).equals("")) {
            fldContraseña.requestFocus();
            throw new Quiz1Exception("Contraseña no válida", jf);
        }else{
            return String.copyValueOf(fldContraseña.getPassword());
        }
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }
    
    public void clear(){
        this.fldContraseña.setText("");
        this.fldUsuario.setText("");
    }
    
}
