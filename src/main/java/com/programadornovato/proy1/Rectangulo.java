package com.programadornovato.proy1;

/**
 *
 * @author eugenio
 */
public class Rectangulo extends Terreno {

    private double lado1;

    private double lado2;

    /**
     *
     * @param lado1
     * @param lado2
     */
    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     *
     * @return
     */
    public double getLado1() {
        return lado1;
    }

    /**
     *
     * @return
     */
    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo "+super.toString()+" {" + "lado1=" + this.lado1 + ", lado2=" + this.lado2 + '}';
    }
    
    /**
     *
     * @return
     */
    public double area() {
        return this.lado1 * this.lado2;
    }
}
