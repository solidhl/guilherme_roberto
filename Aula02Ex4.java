/*Ex4: Crie um algoritmo que leia três strings por meio do JOptionPane e escreva a soma
do comprimento destas strings.*/

import javax.swing.JOptionPane;

public class Aula02Ex4
{
   public static void main(String[] args)
   {
      String sString1 = JOptionPane.showInputDialog("DIGITE A PRIMEIRA STRING: ");
      String sString2 = JOptionPane.showInputDialog("DIGITE A SEGUNDA STRING: ");
      
      JOptionPane.showMessageDialog(null, "A SOMA DO COMPRIMENTO DESSAS STRINGS E: " + (sString1.length() + sString2.length()));
   }
}