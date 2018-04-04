import java.util.Scanner;

public class matrius {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        //escriure matrius (arrays d'arrays)

        int matriu[][] = {{2,3},{4,5},{6,7}}; //aquesta té tres fileres i dues columnes

        System.out.println("Aquesta és la teva matriu: ");

        for (int i=0; i<3; i++) { //aquest for recorre les fileres

            for (int j=0; j<2; j++) { //aquest for recorre les columnes

                System.out.print(matriu[i][j]);
            }

            System.out.println("");
        }

        //si no sabem numeroElements ni elements

        int matriuUsuari[][], numeroFileres, numeroColumnes;

        System.out.println("Introdueix el numero de fileres per la teva matriu: ");
        numeroFileres = entry.nextInt();

        System.out.println("Introdueix el numero de columnes per la teva matriu: ");
        numeroColumnes = entry.nextInt();

        matriuUsuari = new int[numeroFileres][numeroColumnes];

        for (int i=0; i<numeroFileres; i++) { //aquest for recorre les fileres

            System.out.println("Filera " + i + ": ");

            for (int j=0; j<numeroColumnes; j++) { //aquest for recorre les columnes

                System.out.println("Introdueix els elements de la matriu [" + i + "] [" + j + "]: ");
                matriuUsuari[i][j] = entry.nextInt();

            }
        }

        System.out.println("Aquesta és la teva matriu: ");

        for (int i = 0; i < numeroFileres; i++) { //aquest for recorre les fileres

            for (int j = 0; j < numeroColumnes; j++) { //aquest for recorre les columnes

                System.out.print(matriuUsuari[i][j]);
            }

            System.out.println("");
        }
    }
}
