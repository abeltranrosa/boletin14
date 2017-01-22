
package Boletin14;

import javax.swing.JOptionPane;


public class Boletin14 {

   
    public static void main(String[] args) {
        ConversorTemperaturas obx = new ConversorTemperaturas();
        try{
            obx.calcularcentigradosAFharenheit(85);
        }catch(TemperaturaErradaExcepcion e){
            System.out.println("error"+ e.getMessage());
        }
        
    }
    
}
