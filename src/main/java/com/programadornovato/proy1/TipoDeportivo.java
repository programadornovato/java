package com.programadornovato.proy1;

public class TipoDeportivo extends Vehiculo {

    private int cilindros;

    public TipoDeportivo(String matricula, String marca, String modelo,int cilindros) {
        super(matricula, marca, modelo);
        this.cilindros=cilindros;
    }

    @Override
    public String mostrarDatos() {
        return "matricula="+this.matricula+" marca="+this.marca+" modelo="+this.modelo+" cilindros="+this.cilindros;
    }
}
