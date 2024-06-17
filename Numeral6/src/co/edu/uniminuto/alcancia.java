package co.edu.uniminuto;

/*
Crear un programa que permita simular una alcancía digital. La alcancía permite 
gestionar el ingreso de monedas, el usuario en todo momento puede consultar la 
cantidad de dinero que posee y la cantidad de transacciones de ingreso y egreso 
de dinero y cantidad de dinero en cada transacción.
 */

import java.util.ArrayList;
import java.util.List;

public class alcancia {
    private List<transaccion> transacciones;

    public alcancia() {
        transacciones = new ArrayList<>();
    }

    public void agregarMoneda(moneda moneda, int cantidad) {
        transacciones.add(new transaccion("Ingreso", moneda, cantidad));
    }

    public void retirarMoneda(moneda moneda, int cantidad) {
        transacciones.add(new transaccion("Egreso", moneda, cantidad));
    }

    public int getTotalDinero() {
        int total = 0;
        for (transaccion transaccion : transacciones) {
            if (transaccion.getTipo().equals("Ingreso")) {
                total += transaccion.getTotal();
            } else {
                total -= transaccion.getTotal();
            }
        }
        return total;
    }

    public int getTotalTransacciones() {
        return transacciones.size();
    }

    public void mostrarTransacciones() {
        for (transaccion transaccion : transacciones) {
            System.out.println(transaccion.getTipo() + " - Moneda: " + 
            transaccion.getMoneda().getValor() +", Cantidad: " + 
                    transaccion.getCantidad() + ", Total: " + 
                    transaccion.getTotal());
        }
    }
}
