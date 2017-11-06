/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean opcionNoElegida = false;
        do{
        String res = JOptionPane.showInputDialog(null, "MENU\nElija una opción:\n1)Cuadrado\n2)Triángulo\n3)Circulo");
        switch(String.valueOf(res)){
            case "cuadrado":
                JOptionPane.showMessageDialog(null,"Ha elegido el cuadrado");
                Cuadrado ejemplo = new Cuadrado();
                ejemplo.introducirLado();
                ejemplo.calcularArea();
                break;
            case "triangulo":
                JOptionPane.showMessageDialog(null,"Ha elegido el triangulo");
                Triangulo ejemplo2 = new Triangulo();
                ejemplo2.introducirBaseAltura();
                ejemplo2.calcularArea();
                break;
            case "circulo":
                JOptionPane.showMessageDialog(null,"Ha elegido el circulo");
                Circulo ejemplo3 = new Circulo();
                ejemplo3.introducirRadio();
                ejemplo3.calcularArea();
                break;
            default:JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                opcionNoElegida = true;
        }
        }while(opcionNoElegida);
        
        
        
}
        
        
    }
    

