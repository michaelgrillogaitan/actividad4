package co.edu.uniminuto;

/*
Crear un programa que permita simular una alcancía digital. La alcancía permite 
gestionar el ingreso de monedas, el usuario en todo momento puede consultar la 
cantidad de dinero que posee y la cantidad de transacciones de ingreso y egreso 
de dinero y cantidad de dinero en cada transacción.
 */
public class moneda {
    private int valor;

    public moneda(int valor) {
        if (valor == 100 || valor == 200 || valor == 500 || valor == 1000) {
            this.valor = valor;
        } else {
            System.out.println();
            System.out.println("Valor invalido. Intente Nuevamente");
        }
    }

    public int getValor() {
        return valor;
    }
}
