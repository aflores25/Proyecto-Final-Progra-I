/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logina;

/**
 *
 * @author andrea
 */
public class Password {
    
    public static boolean verificacion(String password){
        
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caracter = false; 
        
        for(char c: password.toCharArray()){
            if(Character.isUpperCase(c)){
                mayuscula = true;
            }else if(Character.isLowerCase(c)){
                minuscula = true;
            }else if(Character.isDigit(c)){
                numero = true;
            }else{
                caracter = true;
            }
        }
        
        return mayuscula && minuscula && numero && caracter;
    }
    
}
