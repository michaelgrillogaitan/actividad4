package co.edu.uniminuto;

/*
Crear un programa que permita simular una alcancía digital. La alcancía permite 
gestionar el ingreso de monedas, el usuario en todo momento puede consultar la 
cantidad de dinero que posee y la cantidad de transacciones de ingreso y egreso 
de dinero y cantidad de dinero en cada transacción.
 */

import java.util.Scanner;

public class AlcanciaVirtual {
public static void main(String[] args) {
        alcancia alcancia = new alcancia();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("1. Agregar Moneda");
            System.out.println("2. Retirar Moneda");
            System.out.println("3. Consultar Total Dinero");
            System.out.println("4. Consultar Total Transacciones");
            System.out.println("5. Mostrar Transacciones");
            System.out.println("6. Salir");
            System.out.println();
            
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor de la moneda (100, 200, "
                            + "500, 1000): ");
                    int valorIngreso = scanner.nextInt();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidadIngreso = scanner.nextInt();
                    alcancia.agregarMoneda(new moneda(valorIngreso), 
                            cantidadIngreso);
                    break;
                case 2:
                    System.out.print("Ingrese el valor de la moneda (100, 200, "
                            + "500, 1000): ");
                    int valorEgreso = scanner.nextInt();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidadEgreso = scanner.nextInt();
                    alcancia.retirarMoneda(new moneda(valorEgreso), 
                            cantidadEgreso);
                    break;
                case 3:
                    System.out.println("Total Dinero en la Alcancia: " + 
                            alcancia.getTotalDinero());
                    break;
                case 4:
                    System.out.println("Total Transacciones: " + 
                            alcancia.getTotalTransacciones());
                    break;
                case 5:
                    alcancia.mostrarTransacciones();
                    break;
                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
        scanner.close();
    }    
}
