/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg3;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obx1 = new Scanner (System.in);
        Metodos obx2=new Metodos();
        System.out.println("Introduzca un numero");
        obx2.setNum(obx1.nextInt());
        obx2.getNum();
        
        if(obx2.getNum()==0){
            System.out.println("0");
        }
        else if (obx2.getNum()<0){
            System.out.println("-");
        }
        else{
            System.out.println("+");
        }
        
    }
    
}
