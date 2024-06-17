/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion.pkg3;

import co.edu.uniminuto.entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ejercicion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Cliente> ListClientes = new ArrayList<>();

        short opcion = 0;
        String nombre = "";
        String apellido = "";
        String ID = "";
        String Habitacion = "";
        double diasEstadia = 0;
        double valorHabitacion = 0;
        double cantidadHabitaciones = 0;
        Cliente cliente; //declaracion de objeto de tipo estudiante

        nombre = JOptionPane.showInputDialog("dame tu nombre ");
        apellido = JOptionPane.showInputDialog("dame tu apellido ");
        ID = JOptionPane.showInputDialog("dame tu ID ");
        Habitacion = JOptionPane.showInputDialog("numero de habitacion ");
        cantidadHabitaciones = Double.parseDouble(JOptionPane.showInputDialog("cantidad de habitaciones  "));
        diasEstadia = Double.parseDouble(JOptionPane.showInputDialog("dias de estadia"));
        valorHabitacion = Double.parseDouble(JOptionPane.showInputDialog("valor de habitacion "));
        cliente = new Cliente(nombre, apellido, ID, Habitacion, diasEstadia, cantidadHabitaciones, valorHabitacion);
        ListClientes.add(cliente);

        for (Cliente e : ListClientes) {
            System.out.println(e);
        }
        cliente = new Cliente();
        double avGlobal = cliente.promediarGlobal(ListClientes);
        System.out.println("precio total: " + avGlobal);
    }
}
