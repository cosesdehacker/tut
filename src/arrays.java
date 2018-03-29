import javax.swing.*;

public class arrays {

    public static void main(String[] args) {

        //aquesta és una forma d'escriure arrays
        int[] numeros = new int[3];

        numeros[0] = 9;
        numeros [1] = 2;

        System.out.println(numeros[1]);
        System.out.println(numeros[2]); //els índex sense valor assignat s'inicialitzen amb 0

        //aquesta és l'altra forma d'escriure arrays
        int[] numbers = {4,1,8,10};

        System.out.println(numbers[3]);

        //l'usuari pot introduir el número de dades d'un array

        int numeroElements = Integer.parseInt(JOptionPane.showInputDialog("Introdueix el número d'elements del teu array: "));

        int[] xifres = new int[numeroElements];

        for (int i=0; i<numeroElements; i++) {

            xifres[i] = i+100;
        }

        System.out.println(xifres[31]);

        //si no sabem quants índexs té l'array

        char[] lletres = {'a','d','f','w','o','p','q'};

        for (int i=0; i<lletres.length; i++) {

            System.out.println(lletres[i]);
        }

        for (char x:lletres) { //totalment equivalent al 'for' anterior // ES DIU BUCLE 'FOR EACH'

            System.out.println("la lletra és "+x);
        }
    }
}
