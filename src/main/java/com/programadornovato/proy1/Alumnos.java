package com.programadornovato.proy1;

public class Alumnos {

    private String nombre;

    private char aula;

    private float calificacion;

    public Alumnos(String nombre, char aula) {
        this.nombre=nombre;
        this.aula=aula;
    }

    public void setCalificacion(float calficacion) {
        if(calificacion>10){
            this.calificacion=10;
        }
        else if(calificacion<0){
            this.calificacion=0;
        }
        else{
            this.calificacion=calficacion;
        }
    }

    public float getCalificacion() {
        return this.calificacion;
    }

    public char getAula() {
        return this.aula;
    }
}
