/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maiic
 */
public class Cliente {
          //1.atributos 
    private String nombre;
    private String apellido;
    private String ID;
    private String Habitacion;
    private double diaEstadia;
    private double cantidadHabitaciones;
    private double valorHabitacion;
    
    //2.metodo constructor 

    public Cliente(String nombre, String apellido, String ID, String Habitacion, double diaEstadia,double cantidadHabitaciones ,double valorHabitacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.Habitacion = Habitacion;
        this.diaEstadia = diaEstadia;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.valorHabitacion = valorHabitacion;
    }
    //3.metodo de acceso 
    public Cliente() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public double getDiaEstadia() {
        return diaEstadia;
    }

    public void setDiaEstadia(double diaEstadia) {
        this.diaEstadia = diaEstadia;
    } 
    public double getcantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setcantidadHabitaciones(double valorDia) {
        this.cantidadHabitaciones = valorDia;
    }

    public double getValorHabitacion() {
        return valorHabitacion;
    }

    public void setValorHabitacion(double valorHabitacion) {
        this.valorHabitacion = valorHabitacion;
    }
    
public double promediarGlobal(List<Cliente>lista){
     List<Cliente>listaCliente = new ArrayList<>(lista);
     double suma = 0;
     for(Cliente e : listaCliente){
      suma = e.getDiaEstadia()* e.getValorHabitacion()* e.getcantidadHabitaciones();
     }
     return  suma;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", ID=").append(ID);
        sb.append(", Habitacion=").append(Habitacion);
        sb.append(", diaEstadia=").append(diaEstadia); 
        sb.append(", cantidadHabitaciones=").append(cantidadHabitaciones);
        sb.append(", valorHabitacion=").append(valorHabitacion);
        sb.append('}');
        return sb.toString();
        }   
}
