package co.edu.uniminuto;

/*
Calcular el valor a pagar de un cliente por su compra, se desea saber los 
productos que ha comprado: precio, cantidad, descripción. También el total a 
pagar y cálculo de impuestos,adicional se debe tener el nombre, apellidos y 
documento del cliente.
 */

public class cliente {
    private String nombre;
    private String apellidos;
    private String documento;
    
    public cliente(String nombre, String apellidos, String documento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getDocumento() {
        return documento;
    }
}
