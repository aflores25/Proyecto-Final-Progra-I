/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
/**
 *
 * @author andrea
 */
public class Cursos {
    
    UUID uuid = UUID.randomUUID();
    String id = uuid.toString();
    public String nombre;
    public String seccion;
    public Date fechai;
    public Date fechaf;
    public String horai;
    public String horaf;
    public String profesor;
    public ArrayList<Estudiante> estudiantes = new ArrayList<>();

    
}
