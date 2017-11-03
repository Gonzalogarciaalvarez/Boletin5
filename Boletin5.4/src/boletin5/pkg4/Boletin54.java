/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg4;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obx1 = new Scanner (System.in);
        Metodos obx2=new Metodos();
        System.out.println("Introduzca el primer nombre");
        obx2.setNome1(obx1.nextLine()); 
        System.out.println("Introduzca el segundo nombre");
        obx2.setNome2(obx1.nextLine());  
        System.out.println("Introduzca el peso de "+obx2.getNome1());
        obx2.setNum1(obx1.nextFloat());
        System.out.println("Introduzca el peso de "+obx2.getNome2());
        obx2.setNum2(obx1.nextFloat());
        if(obx2.getNum1()<obx2.getNum2()){
            System.out.println("Con un peso de "+obx2.getNum2()+", "+obx2.getNome2()+" pesa "+obx2.restaCaso2(obx2.getNum1(), obx2.getNum2())+" mas que "+obx2.getNome1());
        }
        else if(obx2.getNum1()>obx2.getNum2()){
            System.out.println("Con un peso de "+obx2.getNum1()+", "+obx2.getNome1()+" pesa "+obx2.restaCaso1(obx2.getNum1(), obx2.getNum2())+" mas que "+obx2.getNome2());
        }
        else{
            System.out.println(obx2.getNome1()+" e "+obx2.getNome2()+" pesan "+obx2.getNum1());
        }
    }
    
}
