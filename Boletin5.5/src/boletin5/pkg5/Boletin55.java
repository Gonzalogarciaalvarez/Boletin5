/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg5;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx1=new Metodos();
        Scanner obx2=new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        obx1.setNum1(obx2.nextInt());
        System.out.println("Introduzca el segundo numero");
        obx1.setNum2(obx2.nextInt());
        System.out.println("Introduzca el tercer numero");
        obx1.setNum3(obx2.nextInt());
        if(obx1.getNum1()>obx1.getNum2()){
            if(obx1.getNum1()>obx1.getNum3()){
                System.out.println("El "+obx1.getNum1()+" es el mayor numero");
            }
        }
        else if (obx1.getNum2()>obx1.getNum1()){
                if(obx1.getNum2()>obx1.getNum3()){
                    System.out.println("El "+obx1.getNum2()+" es el mayor numero");
                }
        }
        else if (obx1.getNum3()>obx1.getNum1()){
                    if(obx1.getNum3()>obx1.getNum2()){
                        System.out.println("El "+obx1.getNum3()+" es el mayor numero");
                    }
                }
         else{
                    System.out.println("Los tres numero son iguales");
                    }
    }
    
}
