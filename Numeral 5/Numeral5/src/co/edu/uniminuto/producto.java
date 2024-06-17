package co.edu.uniminuto;

/*
Calcular el valor a pagar de un cliente por su compra, se desea saber los 
productos que ha comprado: precio, cantidad, descripción. También el total a 
pagar y cálculo de impuestos, adicional se debe tener el nombre, apellidos y 
documento del cliente.
 */
public class producto {
    private String descripcion;
    private double precio;
    private int cantidad;
    
    public producto(String descripcion, double precio, int cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public double getSubtotal() {
        return precio * cantidad;
    }
        
}
