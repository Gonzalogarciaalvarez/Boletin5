/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg2;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
    short a,b;

    public Metodos() {
    }

    public short getA() {
        return a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public void setA(short a) {
        this.a = a;
    }
    public short resta(short a, short b){
        return (short) (a-b);
    }
    public short suma(short a, short b){
        return (short) (a+b);
    }
    
    
}
