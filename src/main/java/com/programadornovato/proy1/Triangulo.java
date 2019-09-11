package com.programadornovato.proy1;

/**
 * Esta clase se encarga de calcular el area del triangulo en base a los lados de este
 * @author eugenio
 */
public class Triangulo extends Terreno {

    private double lado1;

    private double lado2;

    private double lado3;

    /**
     * Inicializamos los lados del tringulo
     * @param lado1
     * @param lado2
     * @param lado3
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    /**
     *
     * @return
     */
    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo "+super.toString()+" {" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }

    /**
     * Se calcula el area usando la formula de Heron
     * @return va retornar el area del triangulo
     */    
    public double area() {
        double s = (this.lado1 + this.lado2 + this.lado3) / 2;
        return   Math.sqrt(   s * ( s -this.lado1 ) *  ( s -this.lado2 ) *  ( s -this.lado3 )  );
    }
}
