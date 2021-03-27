/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_mensaje;

import java.sql.Connection;

/**
 *
 * @author sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con =new Conexion();
        try (Connection cnx = con.get_connection()){
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}
