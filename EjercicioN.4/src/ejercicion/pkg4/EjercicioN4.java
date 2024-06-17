/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion.pkg4;

import co.edu.uniminuto.entity.Cliente_;
import co.edu.uniminuto.entity.Cotizacion;
import co.edu.uniminuto.entity.Veiculo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author maiic
 */
public class EjercicioN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Cotizacion> ListCotizaciones = new ArrayList<>();
        List<Cliente_> ListClientes = new ArrayList<>();
        List<Veiculo> ListVeiculos = new ArrayList<>();
        String nombre = "";
        String apellido = "";
        String ID = "";
        String marca = "";
        String modelo = "";
        String color = "";
        String año = "";
        String motivoReparacion = "";
        double gastosAdmin = 0;
        double repuestos = 0;
        //declaracion de objeto
        Cliente_ cliente;
        Veiculo veiculo;
        Cotizacion cotizacion;

        nombre = JOptionPane.showInputDialog("dame tu nombre ");
        apellido = JOptionPane.showInputDialog("dame tu apellido ");
        ID = JOptionPane.showInputDialog("dame tu ID ");
        cliente = new Cliente_(nombre, apellido, ID, año, repuestos);
        ListClientes.add(cliente);

        marca = JOptionPane.showInputDialog("cual es la marca del carro?");
        modelo = JOptionPane.showInputDialog("que modelo es?: ");
        color = JOptionPane.showInputDialog("de que color es?:");
        año = JOptionPane.showInputDialog("de que año es?: ");
        motivoReparacion = JOptionPane.showInputDialog("cual es el motivo de la reparacion?: ");
        veiculo = new Veiculo(marca, modelo, color, año, motivoReparacion);
        ListVeiculos.add(veiculo);

        gastosAdmin = Double.parseDouble(JOptionPane.showInputDialog("valor revision"));
        repuestos = Double.parseDouble(JOptionPane.showInputDialog("valor de repuestos"));
        cotizacion = new Cotizacion(repuestos, gastosAdmin);
        ListCotizaciones.add(cotizacion);

        for (Cliente_ e : ListClientes) {
            System.out.println(e);
        }
        for (Veiculo e : ListVeiculos) {
            System.out.println(e);
        }
        for (Cotizacion e : ListCotizaciones) {
            System.out.println(e);
        }
        cotizacion = new Cotizacion();
        double pago = cotizacion.total(ListCotizaciones);
        System.out.println("mano de obra: " + (pago * 0.015));
        double vTotal = pago + (pago * 0.015);
        System.out.println("total a pagar: "+vTotal);
    }
}
