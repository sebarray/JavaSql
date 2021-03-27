/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_mensaje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sebas
 */
public class Conexion {

    public Connection get_connection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app", "root", "");
            if (con != null) {
                System.out.println("coneccion realizada");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return con;

    }
}
