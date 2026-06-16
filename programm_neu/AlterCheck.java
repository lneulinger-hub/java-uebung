package programm_neu;

import javax.swing.JOptionPane; 

  
public class AlterCheck { 

    public static void main(String[] args) { 

            String input = JOptionPane.showInputDialog("Bitte geben Sie Ihr Alter ein:");
            int alter = Integer.parseInt(input);

            if (alter >= 18) {
                JOptionPane.showMessageDialog(null, "volljährig.");
            } else {
                JOptionPane.showMessageDialog(null, "minderjährig.");
            }
     }
}