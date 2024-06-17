/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;


public class Veiculo {
        //1.atributos 
    private String marca;
    private String modelo;
    private String color;
    private String año;
    private String motivoReparacion;

    //2.metodo constructor 

    public Veiculo(String marca, String modelo, String color, String año, String motivoReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.motivoReparacion = motivoReparacion;
    }
   
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMotivoReparacion() {
        return motivoReparacion;
    }

    public void setMotivoReparacion(String motivoReparacion) {
        this.motivoReparacion = motivoReparacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Veiculo{");
        sb.append("marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", color=").append(color);
        sb.append(", a\u00f1o=").append(año);
        sb.append(", motivoReparacion=").append(motivoReparacion);
        sb.append('}');
        return sb.toString();
    }
   
}


