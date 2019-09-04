/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.programadornovato.proy1;

/**
 *
 * @author eugenio
 */
public class Calculadora {
    public int suma(int a,int b){
        int res=0;
        if(a>0 && b>0){
            res=a+b;
        }
        return res;
    }
    public int resta(int a,int b){
        int res=0;
        if(a>0 && b>0){
            res=a-b;
        }
        return res;
    }
    public int multiplicacion(int a,int b){
        int res=0;
        if(a>0 && b>0){
            res=a*b;
        }
        return res;
    }
    public int divicion(int a,int b){
        int res=0;
        if(a>0 && b>0){
            res=a/b;
        }
        return res;
    }
}
