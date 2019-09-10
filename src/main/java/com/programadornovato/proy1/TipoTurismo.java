package com.programadornovato.proy1;

public class TipoTurismo extends Vehiculo {

    private int numeroPuertas;

    public TipoTurismo(String matricula, String marca, String modelo,int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas=numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "matricula="+this.matricula+" marca="+this.marca+" modelo="+this.modelo+" numeroPuertas="+this.numeroPuertas;
    }
}
