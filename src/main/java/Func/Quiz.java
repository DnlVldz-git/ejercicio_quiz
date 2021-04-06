/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Func;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Quiz implements Serializable{
    private String nombre;
    private String asignatura;
    private int numPreguntas;
    private ArrayList<Pregunta> preguntas;
    
    public Quiz(String nombre, String asignatura, int num){
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.numPreguntas = num;
        preguntas = new ArrayList();        
    }
    
    public void add(Pregunta pregunta){
        preguntas.add(pregunta);
    }

    public int getNumPreguntas() {
        return numPreguntas;
    }        

    public String getNombre() {
        return nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
    
    
    
     
}
