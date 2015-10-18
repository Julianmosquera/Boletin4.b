
package boletin4.b;

import javax.swing.JOptionPane;

/**
 *
 * @author julianlinux
 */
public class Boletin4B {

    public static void main(String[] args) {
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50f);
        consumo1.setPGas(1.57f);
        Consumo consumo2 = new Consumo(5.6f,4f,67f,2.63f);
        JOptionPane.showMessageDialog(null,"El consumo medio del primer vehículo es de " +consumo1.consumoMedios(2.5f,3.7f)+ " litros");
        consumo2.setLitros(4.5f);
        JOptionPane.showMessageDialog(null,"La velocidad media del segundo vehículo es de " + consumo1.getvMed() + " km/h");
        
    }
    
}




        
        
        
        
        
        
        
   
    

