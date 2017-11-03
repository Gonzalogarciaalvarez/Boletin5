/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg4;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
    float num1,num2;
    String nome1,nome2;
    public Metodos() {
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public String getNome1() {
        return nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public float restaCaso1(float num1,float num2){
        return num1-num2;
    }
    public float restaCaso2(float num1,float num2){
        return num2-num1;
    }
}
