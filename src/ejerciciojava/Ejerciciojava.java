/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Hola
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
    /*El main crea un bucle que hasta que no se de a 0 se repita infinitamente
     Guardamos el resultado introducido en el menu y se segun lo seleccionado se mostrara una cosa o otra
     Si se introduce un codigo equivocado saldra un mensaje por pantalla
     */
    public static void main(String[] args) {
        int opcion;
        double radio;
        boolean bucle = true;
        while (bucle == true) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    radio = pideRadio();
                    String resultado1 = String.format("La circunferencia es de: %.2f", circunferencia(radio));
                    System.out.println(resultado1.replace(",", "."));
                    break;
                case 2:
                    radio = pideRadio();
                    String resultado2 = String.format("La area es de: %.2f", circunferencia(radio));
                    System.out.println(resultado2.replace(",", "."));
                    break;
                case 3:
                    radio = pideRadio();
                    String resultado3 = String.format("El volumen es de: %.2f", circunferencia(radio));
                    System.out.println(resultado3.replace(",", "."));                   
                    break;
                case 4:
                    radio = pideRadio();
                    String resultado4 = String.format("La circunferencia es de: %.2f", circunferencia(radio));
                    System.out.println(resultado4.replace(",", "."));
                    System.out.print("\n");
                    resultado4 = String.format("La area es de: %.2f", circunferencia(radio));
                    System.out.println(resultado4.replace(",", "."));
                    System.out.print("\n");
                    resultado4 = String.format("El volumen es de: %.2f", circunferencia(radio));
                    System.out.println(resultado4.replace(",", "."));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    bucle = false;
                    break;
                default:
                    System.out.println("Numero introducido incorrecto");

            }
        }

    }

    /* El menu muestra todas las opciones disponibles */
    public static int menu() {
        Scanner respuesta = new Scanner(System.in);
        System.out.println("\nMENU");
        System.out.println("1. Circunferencia");
        System.out.println("2. Area");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opci??n: ");
        return respuesta.nextInt();
    }

    /* Pide por pantalla introducir un radio */
    public static double pideRadio() {
        Scanner respuesta = new Scanner(System.in);
        System.out.print("Introduce un radio:");
        return respuesta.nextInt();
    }

    /*Calcula la circunferencia recibiendo como parametro un radio */
    public static double circunferencia(double r) {
        return 2 * Math.PI * r;
    }

    /*Calcula el area recibiendo como parametro un radio */
    public static double area(double r) {
        return Math.PI * r * r;
    }

    /*Calcula el volumen recibiendo como parametro un radio */
    public static double volumen(double r) {
        return 4.0 / 3.0 * Math.PI * r * r * r;
    }
}
