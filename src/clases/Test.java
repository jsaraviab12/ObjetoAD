/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author jsaravia1
 */
public class Test {
    public static void main(String[] args) {
       Persona p;
       p = new Persona (98122212,"Jesús","Saravia");
       
      
        JOptionPane.showMessageDialog(null,"el nombre del objeto p es: "+ p.getPrimer_nombre());
    }
}
