/*Ex3: Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o
método double Math.pow(base, expoente), onde base e expoente são números
reais.*/

import javax.swing.JOptionPane;

public class Aula02Ex3
{
   public static void main(String [] args)
   {
      String sNumero = JOptionPane.showInputDialog("DIGITE O NUMERO: ");
        
      double numero = Double.parseDouble(sNumero);
        
      JOptionPane.showMessageDialog(null, "ESTE NUMERO AO QUADRADO E: " + (Math.pow(numero, 2)));
   }
}