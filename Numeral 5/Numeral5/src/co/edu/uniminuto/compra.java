package co.edu.uniminuto;

/*
Calcular el valor a pagar de un cliente por su compra, se desea saber los 
productos que ha comprado: precio, cantidad, descripción. También el total a 
pagar y cálculo de impuestos,adicional se debe tener el nombre, apellidos y 
documento del cliente.
 */

import java.util.ArrayList;
import java.util.List;

public class compra {
    private cliente cliente;
    private List<producto> productos;
    private static final double IMPUESTO = 0.18;
    
    public compra(cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(producto producto) {
        productos.add(producto);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (producto producto : productos) {
            total += producto.getSubtotal();
        }
        return total + (total * IMPUESTO); 
    }
    
    public void mostrarDetallesCompra() {
        System.out.println("Cliente: " + cliente.getNombre() + " " + 
                cliente.getApellidos());
        System.out.println("Documento: " + cliente.getDocumento());
        System.out.println("Productos Comprados:");
        for (producto producto : productos) {
            System.out.println("Descripcion: " + producto.getDescripcion());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad: " + producto.getCantidad());
            System.out.println("Subtotal: " + producto.getSubtotal());
            System.out.println();
        }
        
        System.out.println("Total a Pagar (con impuestos): " + calcularTotal());
    }
}
