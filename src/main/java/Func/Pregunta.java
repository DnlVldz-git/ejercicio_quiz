/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Func;

import java.io.File;
import java.io.Serializable;
import javax.swing.JFrame;

/**
 *
 * @author dani
 */
public class Pregunta implements Serializable{
    private String pregunta;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private int correcta;
    private JFrame jf;
    
    
    public Pregunta(String pregunta, String op1, String op2, String op3, String op4, int correcta) throws Quiz1Exception{
        jf=new JFrame();
        jf.setAlwaysOnTop(true);
        this.setPregunta(pregunta);
        this.setOp1(op1);
        this.setOp2(op2);
        this.setOp3(op3);
        this.setOp4(op4);
        this.setCorrecta(correcta);
    }

    public String getPregunta() {
        return pregunta;
    }
    
   

    public void setPregunta(String pregunta) throws Quiz1Exception {
        if (pregunta.equals("")) {
            throw new Quiz1Exception("Espacio vacío.", jf);
        }else{
            this.pregunta = pregunta;    
        }        
    }

    public String getOp1() {       
        return op1;
    }

    public void setOp1(String op1) throws Quiz1Exception {
        if (op1.equals("")) {
            throw new Quiz1Exception("Espacio vacío.", jf);
        }else{
            this.op1 = op1;
        }        
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) throws Quiz1Exception {
        if (op2.equals("")) {
            throw new Quiz1Exception("Espacio vacío.", jf);
        }else{
            this.op2 = op2;
        }
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) throws Quiz1Exception {
        if (op3.equals("")) {
            throw new Quiz1Exception("Espacio vacío.", jf);
        }else{
            this.op3 = op3;
        }
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) throws Quiz1Exception {
        if (op4.equals("")) {
            throw new Quiz1Exception("Espacio vacío.", jf);
        }else{
            this.op4 = op4;
        }
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) throws Quiz1Exception {        
        
        if (correcta == 0) {
            throw new Quiz1Exception("Seleccione una respuesta correcta.", jf);
        }else{           
            this.correcta = correcta;
        }
    }
        
}
