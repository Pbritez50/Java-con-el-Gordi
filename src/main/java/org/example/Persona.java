package org.example;

import java.util.Date;

public class Persona {


    ///atributo
    private String nombre;
    private String apellido;
    private int edad;
    private Date nacimiento;

    //funcione - propiedades-
     public Persona(String nom, String ape, int edad, Date fecha){
         nombre = nom;
         apellido = ape;
         this.edad = edad;
         nacimiento = fecha;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", nacimiento=" + nacimiento +
                '}';
    }
}
