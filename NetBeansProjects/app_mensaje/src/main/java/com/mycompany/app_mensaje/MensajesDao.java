/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_mensaje;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
                String query = "INSERT INTO mensajes ( mesnaje, autor ) VALUES (?,?)";
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
        Conexion conDb = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (var conexion = conDb.get_connection()) {
            String query = "select * from mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("id :" + rs.getInt("id_mensaje"));
                System.out.println("mensaje : "+ rs.getString("mesnaje"));
                System.out.println("mensaje : " + rs.getString("autor"));
                System.out.println("fecha" + rs.getString("fecha"));
                System.out.println("---------------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void borrarmensaje(int id) {
         Conexion conDb = new Conexion();
         PreparedStatement ps= null;
         try(var  conexion = conDb.get_connection()) {
             String query ="DELETE   FROM mensajes WHERE id_mensaje = ?";
             ps= conexion.prepareStatement(query);
             ps.setInt(1, id);
             ps.executeUpdate();
             System.out.println("mensaje borrado");
        } catch (Exception e) {
        }

    }

    public static void actualizar(Mensaje mensaje) {
        
        
        Conexion conDb = new Conexion();
        try (var conexion = conDb.get_connection()) {
            PreparedStatement ps = null;
            try {
                String query = "update mensajes  set mesnaje = ? where id_mensaje=?";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getId());
                ps.executeUpdate();
                System.out.println("mensaje actualizado");

            } catch (Exception f) {
                System.out.println(f);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
