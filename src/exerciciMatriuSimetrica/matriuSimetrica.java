package exerciciMatriuSimetrica;

import java.util.Scanner;

public class matriuSimetrica {

    Scanner entry = new Scanner(System.in);
    int matriu[][], numeroFileres, numeroColumnes;
    boolean simetric = true;

    public void matriuSimetricaMetode() {

        omplirMatriu();
        printMatriu();
        esSimetrica();
        printResultat();

    }

    private void omplirMatriu() {

        System.out.println("Introdueix el numero de fileres per la teva matriu: ");
        numeroFileres = entry.nextInt();

        System.out.println("Introdueix el numero de columnes per la teva matriu: ");
        numeroColumnes = entry.nextInt();

        matriu = new int[numeroFileres][numeroColumnes];

        for (int i = 0; i < numeroFileres; i++) { //aquest for recorre les fileres

            System.out.println("Filera " + i + ": ");

            for (int j = 0; j < numeroColumnes; j++) { //aquest for recorre les columnes

                System.out.println("Introdueix els elements de la matriu [" + i + "] [" + j + "]: ");
                matriu[i][j] = entry.nextInt();
            }
        }
    }

    private void printMatriu() {

        System.out.println("Aquesta és la teva matriu: ");

        for (int i = 0; i < numeroFileres; i++) { //aquest for recorre les fileres

            for (int j = 0; j < numeroColumnes; j++) { //aquest for recorre les columnes

                System.out.print(matriu[i][j]);
            }

            System.out.println("");
        }
    }

    private void esSimetrica() {

        if (numeroFileres == numeroColumnes) {

            int i = 0;
            while (simetric && i < numeroFileres) {

                for (int j = 0; j < numeroColumnes; j++) {

                    if (matriu[i][j] == matriu[j][i]) {

                        simetric = true;

                    } else {

                        simetric = false;
                    }
                }

                i++;
            }
        } else {

            simetric = false;
        }
    }

    private void printResultat() {

        if(simetric) {
            System.out.println("La teva matriu és simètrica.");

        } else {
            System.out.println("La teva matriu no és simètrica.");
        }
    }
}