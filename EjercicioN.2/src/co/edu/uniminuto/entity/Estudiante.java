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
public class Estudiante {
    //1.atributos 
    private String nombre;
    private String apellido;
    private String carrea;
    private String semestre;
    private double promedio;
    //2.metodo constructor 
    public Estudiante(String nombre, String apellido, String carrea, String semestre, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrea = carrea;
        this.semestre = semestre;
        this.promedio = promedio;
    }
    //3.metodo de acceso 

    public Estudiante() {
        
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

    public String getCarrea() {
        return carrea;
    }

    public void setCarrea(String carrea) {
        this.carrea = carrea;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
public double promediarGlobal(List<Estudiante>lista){
     List<Estudiante>listaEstudiantes = new ArrayList<>(lista);
     double suma = 0;
     for(Estudiante e : listaEstudiantes){
      suma += e.getPromedio();
     }
     return suma / listaEstudiantes.size();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", carrea=").append(carrea);
        sb.append(", semestre=").append(semestre);
        sb.append(", promedio=").append(promedio);
        sb.append('}');
        return sb.toString();
    }
       
}

