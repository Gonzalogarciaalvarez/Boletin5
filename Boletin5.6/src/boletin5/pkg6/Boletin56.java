/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg6;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx1=new Metodos();
        Scanner obx2=new Scanner(System.in);
        System.out.println("Introduzca el nombre de el producto");
        obx1.setNome(obx2.nextLine());
        System.out.println("Introduzca las ventas de "+obx1.getNome()+" que se han realizado este año");
        obx1.setVentas(obx2.nextInt());
        if(obx1.getVentas()<=100){
            System.out.println(obx1.getNome()+" é un producto de baixo consumo");
        }
        if (obx1.getVentas()>100){
            if (obx1.getVentas()<=500){
                System.out.println(obx1.getNome()+" é un producto de medio consumo");
            }
        }
        if (obx1.getVentas()>500){
            if (obx1.getVentas()<=1000){
                System.out.println(obx1.getNome()+" é un producto de alto consumo");
            }
        }
        if (obx1.getVentas()>1000){
            System.out.println(obx1.getNome()+" é un producto de primeira necesidade");
        }
        
    }
    
}
