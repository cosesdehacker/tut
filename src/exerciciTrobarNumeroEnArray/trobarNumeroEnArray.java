package exerciciTrobarNumeroEnArray;

import java.util.Scanner;

public class trobarNumeroEnArray {

    Scanner entry = new Scanner(System.in);
    int array[] = new int[9];
    int numeroUsuari, posicioNumeroUsuari;
    boolean numeroExisteix = false;

    public void trobarNumeroEnArrayMetode() {

        omplirArray();
        getNumeroUsuari();
        trobarPosició();
    }

    private void omplirArray() {

        System.out.println("Introdueix els números del teu array: ");

        for (int i=0; i<array.length; i++) {

            System.out.println((i+1) + ") ");
            array[i] = entry.nextInt();

        }

        System.out.println("Aquest és el teu array: ");

        for (int i=0; i<array.length; i++) {

            System.out.println(array[i]);
        }

    }

    private void getNumeroUsuari() {

        System.out.println("Introdueix el número que vols cercar: ");
        numeroUsuari = entry.nextInt();

    }

    private void trobarPosició() {

        for (int i=0; i<array.length; i++) {

            if(array[i] == numeroUsuari) {
                posicioNumeroUsuari = i;
                numeroExisteix = true;
                break;
            }
        }

        if(numeroExisteix) {

            System.out.println("El número que has introduït es troba en la posició "+(posicioNumeroUsuari+1) +" de l'array.");

        } else {

            System.out.println("El número que has introduït no forma part de l'array.");
        }
    }
}
