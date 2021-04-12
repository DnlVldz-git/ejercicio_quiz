/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Func;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dani
 */
public class Quiz1Exception extends Exception {

    /**
     * Creates a new instance of <code>Quiz1Exception</code> without detail
     * message.
     */
    public Quiz1Exception() {
    }

    /**
     * Constructs an instance of <code>Quiz1Exception</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     * @param pnl
     */
    public Quiz1Exception(String msg, JPanel pnl) {
        JOptionPane.showMessageDialog(pnl, msg);
    }
    
    public Quiz1Exception(String msg, JDialog dialog) {
        JOptionPane.showMessageDialog(dialog, msg);
    }
    
    public Quiz1Exception(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public Quiz1Exception(String msg, JFrame frame) {
        JOptionPane.showMessageDialog(frame, msg);
    }
}
