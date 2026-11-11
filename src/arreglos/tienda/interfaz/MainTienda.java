
package arreglos.tienda.interfaz;

import arreglos.tienda.modelo.AppStore;
import arreglos.tienda.modelo.Juego;

import javax.swing.*;
import java.util.Scanner;

public class MainTienda {

    private static Scanner sc = new Scanner(System.in);
    private static AppStore as1 = new AppStore();

    public static void main(String[] args) {

        as1.inicializarDatos();

        int opc;

        do {
            menu();
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {

                case 1: {
                    ingresarJuego();
                } break;

                case 2: {
                    mostrarJuegos();
                } break;

                case 3: {

                } break;

                case 4: {

                } break;

                case 5: {

                } break;

                case 6: {

                } break;

                case 7: {
                    System.out.println("Saliendo del programa...");
                } break;

                default:
                    System.out.println("No es una opción válida");
            }

        } while (opc != 7);
    }

    public static void menu() {
        System.out.println("**********AppStore Udla**********");
        System.out.println("1. Ingresar Juego");
        System.out.println("2. Mostrar juegos");
        System.out.println("3. Buscar juego");
        System.out.println("4. Comprar");
        System.out.println("5. Vender");
        System.out.println("6. Juego más vendido");
        System.out.println("7. Salir");
        System.out.print("Ingrese una opcion: ");
    }

    public static void ingresarJuego() {

        System.out.println("*******Ingreso de datos*******");

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la categoria: ");
        String categoria = sc.nextLine();

        System.out.print("Ingrese el tamanio: ");
        int tamanio = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el precio: ");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el stock inicial: ");
        int licenciasDisponibles = Integer.parseInt(sc.nextLine());

        if (as1.agregarJuego(new Juego(nombre, categoria, tamanio, precio, licenciasDisponibles))) {
            JOptionPane.showMessageDialog(null, "Juego agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No fue posible agregar el Juego");
        }
    }

    public static void mostrarJuegos() {

        Juego juegos[] = as1.getJuegos();

        for (Juego j : juegos) {

            if (j != null) {
                System.out.println(j);
            }
        }
    }
}
