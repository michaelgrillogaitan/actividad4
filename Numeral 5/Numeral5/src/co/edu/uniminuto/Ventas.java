package co.edu.uniminuto;

/*
Calcular el valor a pagar de un cliente por su compra, se desea saber los productos que ha
comprado: precio, cantidad, descripción. También el total a pagar y cálculo de impuestos,
adicional se debe tener el nombre, apellidos y documento del cliente.
 */

import java.util.Scanner;

public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

                System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese los apellidos del cliente: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese el documento del cliente: ");
        String documento = scanner.nextLine();
        
        cliente cliente = new cliente(nombre, apellidos, documento);

        compra compra = new compra(cliente);

        boolean agregarMasProductos = true;

        while (agregarMasProductos) {
            System.out.println();
            System.out.print("Ingrese la descripcion del producto: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            producto producto = new producto(descripcion, precio, cantidad);
            compra.agregarProducto(producto);

            System.out.print("Desea agregar otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            agregarMasProductos = respuesta.equalsIgnoreCase("s");
        }
        
        System.out.println();
        compra.mostrarDetallesCompra();
    }
}
