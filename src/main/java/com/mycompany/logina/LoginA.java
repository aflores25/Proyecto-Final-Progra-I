/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logina;

import java.util.ArrayList;


public class LoginA {
    
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static Estudiante estudianteLogeado = new Estudiante();
    
    public static ArrayList<Cursos> cursos = new ArrayList<>();
    
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    public static void main(String[] args) {
        Login l = new Login();
        l.setVisible(true);
    }
}
