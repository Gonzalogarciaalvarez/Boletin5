/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg2;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        short a,b;
        Scanner obx1 = new Scanner (System.in);
        Metodos obx2=new Metodos();
        obx2.setA(obx1.nextShort());
        obx2.setB(obx1.nextShort());
        
        if(obx2.getA()>=obx2.getB()){
            System.out.println(obx2.getA()+" menos "+obx2.getB()+" es igual a "+obx2.resta(obx2.getA(), obx2.getB()));
        }
        System.out.println("la suma es = "+obx2.suma(obx2.getA(), obx2.getB()));
        
        
        
        
    }
    
}
