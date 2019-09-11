package com.programadornovato.proy1;

/**
 *
 * @author eugenio
 */
public abstract class Terreno {

    /**
     *
     */
    protected int numeroLados;

    /**
     *
     * @param numeroLados
     */
    public Terreno(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     *
     * @return
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Terreno{" + "Numero lados=" + numeroLados + '}';
    }

    /**
     *
     * @return
     */
    public abstract double area();
}
