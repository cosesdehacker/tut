import javax.swing.*;
import java.util.Scanner;

public class tutorialATS2 {

    public static void main(String[] args) {

        String dada = JOptionPane.showInputDialog("Escriu el número 3");
         switch (dada) {
             case "3":
                 System.out.println("Vale!");
                 break;
             default:
                 System.out.println("Hem dit 3");
                 break;

         }

         char lletra = JOptionPane.showInputDialog("Escriu una lletra: ").charAt(0);

         if (Character.isLowerCase(lletra)) {

             JOptionPane.showMessageDialog(null,"La lletra és minúscula");

         } else {

             JOptionPane.showMessageDialog(null,"La lletra és majúscula");

         }

    }

}
