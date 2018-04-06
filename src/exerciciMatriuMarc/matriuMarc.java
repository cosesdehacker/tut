package exerciciMatriuMarc;

import java.util.Scanner;

public class matriuMarc {

    Scanner entry = new Scanner(System.in);
    int matriu[][],numeroFileres,numeroColumnes, x, y;

    public void matriuMarcMetode() {

        inicialitzarMatriu();
        omplirMarc();
        printMatriu();
    }

    private void inicialitzarMatriu() {

        System.out.println("Introdueix el numero de fileres per la teva matriu: ");
        numeroFileres = entry.nextInt();

        System.out.println("Introdueix el numero de columnes per la teva matriu: ");
        numeroColumnes = entry.nextInt();

        matriu = new int[numeroFileres][numeroColumnes];
    }

    private void omplirMarc() {

        for (int i=0; i<numeroFileres; i++){
            for (int j=0; j<numeroColumnes; j++){

                if(i==0 || j==0 || i==numeroFileres-1 || j==numeroColumnes-1) {

                    matriu[i][j] = 1;
                }
            }
        }
    }

    private void printMatriu() {

        System.out.println("Aquesta és la teva matriu: ");

        for (int i = 0; i < numeroFileres; i++) { //aquest for recorre les fileres

            for (int j = 0; j < numeroColumnes; j++) { //aquest for recorre les columnes

                System.out.print(matriu[i][j]+" ");
            }

            System.out.println("");
        }
    }
}

