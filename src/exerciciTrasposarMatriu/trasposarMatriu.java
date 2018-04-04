package exerciciTrasposarMatriu;

import java.util.Scanner;

public class trasposarMatriu {

    Scanner entry = new Scanner(System.in);
    int matriu[][], matriuTrasposada[][], numeroIndex;

    public void trasposarMatriuMetode() {

        omplirMatriu();
        trasposarMatriu();

    }

    private void omplirMatriu() {

        System.out.println("Introdueix el numero de fileres i columnes: ");
        numeroIndex = entry.nextInt();

        matriu = new int[numeroIndex][numeroIndex];
        matriuTrasposada = new int[numeroIndex][numeroIndex];

        for (int i = 0; i< numeroIndex; i++) { //aquest for recorre les fileres

            System.out.println("Filera " + i + ": ");

            for (int j=0; j<numeroIndex; j++) { //aquest for recorre les columnes

                System.out.println("Introdueix els elements de la matriu [" + i + "] [" + j + "]: ");
                matriu[i][j] = entry.nextInt();

            }
        }

        System.out.println("Aquesta és la teva matriu: ");

        for (int i = 0; i < numeroIndex; i++) { //aquest for recorre les fileres

            for (int j = 0; j < numeroIndex; j++) { //aquest for recorre les columnes

                System.out.print(matriu[i][j]);
            }

            System.out.println("");
        }
    }

    private void trasposarMatriu() {

        for (int i = 0; i< numeroIndex; i++) {

            for (int j=0; j<numeroIndex; j++) {

                matriuTrasposada[j][i] = matriu[i][j];

            }
        }

        System.out.println("Aquesta és la teva matriu trasposada: ");

        for (int i = 0; i < numeroIndex; i++) { //aquest for recorre les fileres

            for (int j = 0; j < numeroIndex; j++) { //aquest for recorre les columnes

                System.out.print(matriuTrasposada[i][j]);
            }

            System.out.println("");
        }

    }

}
