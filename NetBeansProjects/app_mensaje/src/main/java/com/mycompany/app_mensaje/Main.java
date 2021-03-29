/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_mensaje;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("aplicaion de mensajes \n 1 crear mensaje \n 2 listar un mensaje \n 3 editar un mensaje \n 4 eliminar un mensaje \n 5 salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    MensajesSevice.crearMensaje();
                    break;
                }
                case 2: {
                    MensajesSevice.leerMensaje();
                    break;
                }
                case 3: {
                    MensajesSevice.actualizar();
                    break;
                }
                case 4: {
                    MensajesSevice.borrarmensaje();
                    break;
                }
                default: {
                }

            }
        } while (opcion != 5);
        // TODO code application logic here
    }

}
