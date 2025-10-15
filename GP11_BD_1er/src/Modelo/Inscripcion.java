package Modelo;

/* @author Grupo 11 */

public class Inscripcion {
    // atributo(s)
    private int idInscripto;
    private double nota;
    private int idAlumno;
    private int idMateria;
    
    // constructor(es)
    public Inscripcion(int idInscripto, int idAlumno, int idMateria) {
        this.idInscripto = idInscripto;
        this.nota = 0.0;
        this.idAlumno = idAlumno;
        this.idMateria = idMateria;
    }

    public Inscripcion() {
    }
    
    
    
    
    // método(s)
    
    
    // getter(s) & setter(s)
    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }
    
}
