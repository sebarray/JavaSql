/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_mensaje;

import java.sql.PreparedStatement;

/**
 *
 * @author sebas
 */
public class MensajesDao {

    public static void crearMensaje(Mensaje mensaje) {
        Conexion conDb = new Conexion();
        try (var conexion = conDb.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO 1mensajes ( mesnaje, autor ) VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor());
                ps.executeUpdate();
                System.out.println("mensaje creado");

            } catch (Exception f) {
                System.out.println(f);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void leerMensaje() {

    }

    public static void borrarmensaje(int id) {

    }

    public static void actualizar(Mensaje mensaje) {

    }

}
