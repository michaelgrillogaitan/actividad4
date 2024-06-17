/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

import java.util.ArrayList;
import java.util.List;

public class Cotizacion {
    
    //1.atributos 
    private double repuestos;
    private double gastosAdmin;

    //2.metodo constructor 

    public Cotizacion( double repuestos, double gastosAdmin) {
        this.repuestos = repuestos;
        this.gastosAdmin = gastosAdmin;
 
        
    }

    public Cotizacion() {
    }

    public double getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(double repuestos) {
        this.repuestos = repuestos;
    }

    public double getGastosAdmin() {
        return gastosAdmin;
    }

    public void setGastosAdmin(double gastosAdmin) {
        this.gastosAdmin = gastosAdmin;
    }
    
    public double total(List<Cotizacion> Lista) {
    List<Cotizacion>ListCotizaciones = new ArrayList<>(Lista);
     double suma = 0;
     for(Cotizacion e : ListCotizaciones){
      suma = e.getGastosAdmin()+ e.getRepuestos();
     }
     return  suma ;
     
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cotizacion{");
        sb.append(", repuestos=").append(repuestos);
        sb.append(", gastosAdmin=").append(gastosAdmin);
        sb.append('}');
        return sb.toString();
    }

}


