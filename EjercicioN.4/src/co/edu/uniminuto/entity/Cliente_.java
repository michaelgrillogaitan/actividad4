/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

/**
 *
 * @author maiic
 */
public class Cliente_ {
     private String nombre;
    private String apellido;
    private String ID;

    //2.metodo constructor 
    public Cliente_(String nombre, String apellido, String ID, String Habitacion, double Dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;

    }
    //3.metodo de acceso 

    public Cliente_() {
        
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", ID=").append(ID);
        sb.append('}');
        return sb.toString();
    }

  
}
