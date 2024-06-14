/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andrea
 */
public class Estudiante {
    
    
    public String apellido;
    public String carne;
    public String nombre;
    public String password;
    Map<String, Integer> nota = new HashMap<>();
    public ArrayList<Cursos> cursos = new ArrayList<>();
}
