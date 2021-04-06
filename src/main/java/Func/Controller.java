/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Func;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Controller {

    private ArrayList<Quiz> preguntas;

    public Controller() {
        this.preguntas = new ArrayList();
    }

    public void guardar() {
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        try {
            File file = new File("quiz.dat");
            FileOutputStream output = new FileOutputStream(file);
            ObjectOutputStream writer = new ObjectOutputStream(output);

            writer.writeObject(this.preguntas);

            writer.close();
            output.close();

            JOptionPane.showMessageDialog(jf, "Guardado exitoso");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    public ArrayList<Quiz> getPreguntas() {
        return preguntas;
    }

    public Quiz getPreguntasAt(int index) {
        return preguntas.get(index);
    }

    public void cargar() throws ClassNotFoundException {
        File file = new File("quiz.dat");
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        if (file.exists()) {
            try {
                FileInputStream input = new FileInputStream(file);
                ObjectInputStream reader = new ObjectInputStream(input);

                this.preguntas = (ArrayList<Quiz>) reader.readObject();

                input.close();
                reader.close();

                JOptionPane.showMessageDialog(jf, "Carga exitosa");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(jf, "Error al cargar");
            }
        } else {
            this.preguntas = new ArrayList();
        }

    }

    public void add(Quiz quiz) {
        preguntas.add(quiz);
    }

}
