package programm_neu;

import javax.swing.JOptionPane; 

  
public class AlterCheck { 

    public static void main(String[] args) { 

            String input = JOptionPane.showInputDialog("Bitte geben Sie Ihr Alter ein:");
            int alter = Integer.parseInt(input);

            if (alter >= 18) {
                System.out.println("volljährig.");
            } else {
                System.out.println("minderjährig.");

            }
    
     }
}