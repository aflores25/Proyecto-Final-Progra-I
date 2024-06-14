/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

/**
 *
 * @author andrea
 */
public class CrearId {
    
    private static Integer CrearId = 1000;
    
    public static String CrearId(){
        String id = "";
        CrearId++;
        
        id = id + CrearId;
        
        return id;
        
    }
}
