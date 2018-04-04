package exerciciMatriuSumaFileresColumnes;

import java.util.Scanner;

public class matriuSumaFileresColumnes {

    Scanner entry = new Scanner(System.in);
    int matriu[][], numeroFileres, numeroColumnes, suma;

    public void matriuSumaFileresColumnesMetode() {

        omplirMatriu();
        sumarColumnes();
        sumarFileres();
    }

    private void omplirMatriu() {

        System.out.println("Introdueix el numero de fileres per la teva matriu: ");
        numeroFileres = entry.nextInt();

        System.out.println("Introdueix el numero de columnes per la teva matriu: ");
        numeroColumnes = entry.nextInt();

        matriu = new int[numeroFileres][numeroColumnes];

        for (int i=0; i<numeroFileres; i++) { //aquest for recorre les fileres

        System.out.println("Filera " + i + ": ");

            for (int j=0; j<numeroColumnes; j++) { //aquest for recorre les columnes

                System.out.println("Introdueix els elements de la matriu [" + i + "] [" + j + "]: ");
                matriu[i][j] = entry.nextInt();

            }
        }

        System.out.println("Aquesta és la teva matriu: ");

        for (int i = 0; i < numeroFileres; i++) { //aquest for recorre les fileres

            for (int j = 0; j < numeroColumnes; j++) { //aquest for recorre les columnes

                System.out.print(matriu[i][j]+" ");
            }

        System.out.println("");

        }
    }

    private void sumarFileres() {

        for (int i=0; i<numeroFileres; i++) {

            suma=0;

            for (int j=0; j<numeroColumnes; j++) {

                suma = matriu[i][j]+suma;
            }

            System.out.println("La suma de la filera "+i+" és "+suma);
        }
    }

    private void sumarColumnes() {

        for (int j=0; j<numeroColumnes; j++) {

            suma=0;

            for (int i=0; i<numeroFileres; i++) {

                suma = matriu[i][j]+suma;
            }

            System.out.println("La suma de la columna "+j+" és "+suma);
        }
    }
}
