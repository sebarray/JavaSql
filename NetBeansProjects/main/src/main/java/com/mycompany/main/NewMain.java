/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author sebas
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {

        int edad;
        Scanner sc = new Scanner(System.in);
        while (true) {
          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("ingrese edad");

            edad = sc.nextInt();
            if (edad >= 4 && edad <= 6) {
                System.out.println(": Lunes y Miércoles de 16 a 17");
            }
            if (edad >= 7 && edad <= 8) {
                System.out.println(": Lunes y Miércoles de 16 a 17");
            }
            if (edad >= 9 && edad <= 10) {
                System.out.println("Martes y Jueves de 17:30 a 19");
            }
            if (edad >= 11 && edad <= 13) {
                System.out.println(" Lunes y Miércoles de 17 a 18:30");
            }

        }
    }

}
