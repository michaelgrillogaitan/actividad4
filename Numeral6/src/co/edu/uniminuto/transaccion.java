package co.edu.uniminuto;

/*
Crear un programa que permita simular una alcancía digital. La alcancía permite 
gestionar el ingreso de monedas, el usuario en todo momento puede consultar la 
cantidad de dinero que posee y la cantidad de transacciones de ingreso y egreso 
de dinero y cantidad de dinero en cada transacción.
 */
public class transaccion {
    private String tipo;
    private moneda moneda;
    private int cantidad;

    public transaccion(String tipo, moneda moneda, int cantidad) {
        this.tipo = tipo;
        this.moneda = moneda;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public moneda getMoneda() {
        return moneda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTotal() {
        return moneda.getValor() * cantidad;
    }
}
