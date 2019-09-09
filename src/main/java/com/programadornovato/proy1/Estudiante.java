package com.programadornovato.proy1;

public class Estudiante extends Persona {

    private String codigoEstudiante;

    private float calificacion;

    public Estudiante(String nombre,String apellido,int edad,String codigoEstudiante,float calificacion) {
        super(nombre, apellido, edad);
        this.codigoEstudiante=codigoEstudiante;
        this.calificacion=calificacion;
    }

    public String getCodigoEstudiante() {
        return this.codigoEstudiante;
    }

    public float getCalificacion() {
        return this.calificacion;
    }

    public void muestraNombre() {
        System.out.println("Nombre:"+this.getNombre());
    }

    public void muestraApellido() {
        System.out.println("Apellido:"+this.getApellido());
    }

    public void muestraEdad() {
        System.out.println("Edad:"+this.getEdad());
    }
}
