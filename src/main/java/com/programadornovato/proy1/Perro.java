package com.programadornovato.proy1;

public class Perro extends Animal {

    @Override
    public void comer() {
        System.out.println("Miserables humanos me dan de tragar en el piso");
    }

    @Override
    public void correr() {
        System.out.println("Nosotros correteamos a los humanos");
    }
}
