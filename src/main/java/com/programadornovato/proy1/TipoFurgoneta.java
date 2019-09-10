package com.programadornovato.proy1;

public class TipoFurgoneta extends Vehiculo {

    private int carga;

    public TipoFurgoneta(String matricula, String marca, String modelo,int carga) {
        super(matricula, marca, modelo);
        this.carga=carga;
    }

    @Override
    public String mostrarDatos() {
        return "matricula="+this.matricula+" marca="+this.marca+" modelo="+this.modelo+" carga="+this.carga;
    }
}
