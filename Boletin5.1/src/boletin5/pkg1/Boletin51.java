/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg1;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obx1 = new Scanner (System.in);
        Metodos obx2=new Metodos();
        obx2.setNum1(obx1.nextInt());
        obx2.getNum1();
        
        if(obx2.getNum1()>=0){
            System.out.println("O numero "+obx2.getNum1()+" é positivo");
        }
        else{
            System.out.println("O numero "+obx2.getNum1()+" é negativo");
        }
    }
}
