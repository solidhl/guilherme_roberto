/*Ex1: Crie um algoritmo para calcular o número de dias aproximado que você viveu,
com base em sua idade.*/

import javax.swing.JOptionPane;

public class Aula02Ex1
{
   public static void main(String[] args)
   {
      String sIdade = JOptionPane.showInputDialog("DIGITE A SUA IDADE: ");
        
      double idade = Double.parseDouble(sIdade);
        
      JOptionPane.showMessageDialog(null, "VOCE VIVEU " + (idade * 365) + "DIAS");
   }
}