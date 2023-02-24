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
        opcion = menu();
        switch (opcion) {
            case 1:
                radio = pideRadio();
                System.out.printf("La circunferencia es de: %.2f", circunferencia(radio));
                break;
            case 2:
                radio = pideRadio();
                System.out.printf("La area es de: %.2f", area(radio));
                break;

        }

    }

    public static int menu() {
        Scanner respuesta = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Circunferencia");
        System.out.println("2. Area");
        System.out.print("Selecciona una opción: ");
        return respuesta.nextInt();
    }

    public static double pideRadio() {
        Scanner respuesta = new Scanner(System.in);
        System.out.print("Introduce un Radio: ");
        return respuesta.nextInt();
    }

    public static double circunferencia(double r) {
        return 2 * Math.PI * r;
    }

    public static double area(double r) {
        return Math.PI * r * r;
    }
}
