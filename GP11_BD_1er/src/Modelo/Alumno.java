package Modelo;

import java.time.LocalDate;

/* @author Grupo 11 */

public class Alumno {
    // atributo(s)
    private Integer idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNacimiento;
    private boolean estado;
    
    // constructor(es)
    
    public Alumno(){}
    
    public Alumno(int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    
    public Alumno(int idAlumno, int dni, String apellido, String nombre, LocalDate fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }
    
    // método(s)
    
    
    // getter(s) & setter(s)
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String pasajeEstado(){
        if(estado){
            return "Activo";
        }else{
            return "Inactivo";
        }
    }
    @Override
    public String toString() {
        return "Alumno" + "\n- Id del Alumno: " + idAlumno + "\n- Dni: " + dni + "\n- Apellido: " + apellido + "\n- Nombre: " + nombre + "\n- Fecha de Nacimiento: " + fechaNacimiento + "\n- Estado: " + pasajeEstado() + "\n";
    }
    
    
}
