/*Ex2: Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de
sua base e de sua altura.*/

import javax.swing.JOptionPane;

public class Aula02Ex2
{
   public static void main(String[] args)
   {
      String sLargura = JOptionPane.showInputDialog("DIGITE A LARGURA DO RETANGULO: ");
        
      String sAltura = JOptionPane.showInputDialog("DIGITE A ALTURA DO RETANGULO: ");
        
      double largura = Double.parseDouble(sLargura);
      double altura = Double.parseDouble(sAltura);
        
      double area = largura * altura;
        
      JOptionPane.showMessageDialog(null, "A AREA DO RETANGULO E: " + area);
        
   }
}