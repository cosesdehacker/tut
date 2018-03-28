import javax.swing.*;
import java.util.Scanner;

public class tutorialATSMath {

    public static void main(String[] args) {

        double raiz = Math.sqrt(9); //Math.sqrt serveix per fer l'arrel quadrada, per definició funciona amb double

        int raiz2 = (int) Math.sqrt(16); // si vull fer servir un altre tipus de variable, ho faig així

        System.out.println(raiz);
        System.out.println(raiz2);

        double base = Double.parseDouble(JOptionPane.showInputDialog("Escriu un número base: ")),
                elev = Double.parseDouble(JOptionPane.showInputDialog("Escriu un exponent: "));

        JOptionPane.showMessageDialog(null, "El resultat és: " + Math.pow(base,elev));

        // el pow serveix per a fer exponenciar un num

        float numeroAmbDecimals = 3.63f; //si vull posar un float he de ficar la f!
        int numeroArrodonit = Math.round(numeroAmbDecimals);
        //el round serveix per a arrodonir

        System.out.println(numeroArrodonit);



    }
}
