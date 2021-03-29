/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_mensaje;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class MensajesSevice {
     public static  void  crearMensaje(){
         String nombre, mensaje;
         Scanner sc= new Scanner(System.in);
         System.out.println("ingrese el mensaje y luego su nombre");
         mensaje= sc.nextLine();
         nombre= sc.nextLine();
         Mensaje msj= new Mensaje();
         msj.setAutor(nombre);
         msj.setMensaje(mensaje);
         MensajesDao.crearMensaje(msj);
         
    
   }
    public static  void leerMensaje(){
    
    }
    public static  void  borrarmensaje(){
        
    }
    
    public static void  actualizar() {
        
    }
    
}
