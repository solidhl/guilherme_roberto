/*Ex3: Crie um algoritmo que leia um n�mero inteiro e o eleve ao quadrado usando o
m�todo double Math.pow(base, expoente), onde base e expoente s�o n�meros
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