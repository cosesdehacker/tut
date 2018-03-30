package exerciciInsertarNumeroArrayOrdenat;

import java.util.Scanner;

public class insertarNumeroArrayOrdenat {

    Scanner entry = new Scanner(System.in);
    int[] array = new int[9];
    int numeroUsuari;

    public void insertarNumeroArrayOrdenatMetode() {

        omplirArray();
        imprimirArray();
        getNumeroUsuari();
        insertarEnPosicióCorrecta();
        imprimirArray();


    }

    private void omplirArray() {

        for (int i = 0; i < 6; i++) {

            System.out.println("Introdueix un número sencer: ");
            array[i] = entry.nextInt();

        }
    }

    private void imprimirArray() {

        System.out.println("Aquest és el teu array: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n");
    }

    private void getNumeroUsuari() {

        System.out.println("Introdueix un número: ");
        numeroUsuari = entry.nextInt();
    }

    private void insertarEnPosicióCorrecta() {

        if (array[0] > numeroUsuari) {

            for (int i=1; i<array.length-1; i++) {

                array[i] = array[i+1];
            }

            array[0] = numeroUsuari;
        }

//        for (int i = 1; i < array.length - 1; i++) {
//        }
    }
}
