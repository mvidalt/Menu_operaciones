/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojava;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Ejerciciojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        double radio;

    }

    public static int menu() {
        Scanner respuesta = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Circunferencia");
        System.out.println("2. Area\n");
        System.out.print("Selecciona una opción: ");
        return respuesta.nextInt();
    }






}