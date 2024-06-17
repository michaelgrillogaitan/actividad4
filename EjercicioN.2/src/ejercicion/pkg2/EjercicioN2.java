    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicion.pkg2;

import co.edu.uniminuto.entity.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *2. El departamento escolar de la facultad de ingeniería necesita 
 * obtener un reporte global de los promedios de sus estudiantes y 
 * que muestre el promedio de cada uno, nombres, apellidos, carrera 
 * y semestre. Se debe imprimir el promedio global y cada uno de los 
 * datos de los estudiantes.
 */
public class EjercicioN2 {
    public static void main(String[] args) {    
List<Estudiante> ListEstudiantes = new ArrayList<>();

short opcion = 0; 
double promedio = 0;
String nombre = "";
String apellido = "";
String carrera = "";
String semestre = "";
Estudiante estudiante; //declaracion de pobjeto de tipo estudiante

try{

    do{
       nombre = JOptionPane.showInputDialog("dame tu nombre ");
       apellido = JOptionPane.showInputDialog("dame tu apellido "); 
       carrera = JOptionPane.showInputDialog("dame tu carrera ");
       semestre = JOptionPane.showInputDialog("dame tu semestre ");
       promedio = Double.parseDouble (JOptionPane.showInputDialog("dame un promedio"));

       if ((promedio > 0) && (promedio <= 5)){
          estudiante = new Estudiante (nombre, apellido, carrera, semestre, promedio); 
          ListEstudiantes.add(estudiante);
       }
      
       else{
           JOptionPane.showInputDialog(null, "valor fuera de rango");
       }
     opcion = Short.parseShort (JOptionPane.showInputDialog("si desea seguir agregando promedios presione 0 "));

    }while (opcion == 0);
}catch(Exception e) {
      System.out.println("erro en catura de datos: " + e.getMessage());
}

for(Estudiante e : ListEstudiantes){
           System.out.println(e);
       }
estudiante = new Estudiante();
double avGlobal=estudiante.promediarGlobal(ListEstudiantes);
      System.out.println("promedio glabal: "+avGlobal);
}
}
