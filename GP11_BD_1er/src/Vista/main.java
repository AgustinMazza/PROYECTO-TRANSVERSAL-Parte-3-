package Vista;

import Modelo.Alumno;
import Persistencia.AlumnoData;
import java.time.LocalDate;

/* @author Grupo 11*/
public class main {

    public static void main(String[] args) {
        Alumno a1 = new Alumno(44752772, "Reta", "Mauricio", LocalDate.of(2003, 4, 13), true);
        Alumno a2 = new Alumno(42357107, "Rodriguez", "Juan Cruz", LocalDate.of(2000, 1, 23), true);
        Alumno a3 = new Alumno(38751080, "Sirur Flores", "Jeremias", LocalDate.of(1995, 3, 13), true);
        Alumno a4 = new Alumno(42238525, "Mazza", "Agustin", LocalDate.of(1999, 12, 11), true);
        Alumno a5 = new Alumno(46807350, "Hoyo", "Jeremias", LocalDate.of(2005, 11, 21), true);
        Alumno a6 = new Alumno(42778631, "Lopez Cozzella", "Facundo", LocalDate.of(2000, 8, 13), true);

        AlumnoData alu = new AlumnoData();

        /*
        alu.guardarAlumno(a1);
        alu.guardarAlumno(a2);
        alu.guardarAlumno(a3);
        alu.guardarAlumno(a4);
        alu.guardarAlumno(a5);
        alu.guardarAlumno(a6);
        
        LO COMENTAMOS PARA QUE NO SE VUELVAN A AGREGAR EN LA BD
        DESCOMENTAR PARA AGREGAR A TU BD
        */
        
        System.out.println("GRUPO 11 - (NO NOS SEPAREN)");
        for (int i = 4; i < 10; i++) {
            Alumno aluEncontrado = alu.buscarAlumno(i);
            System.out.println(aluEncontrado.toString());
        }
    }
}
