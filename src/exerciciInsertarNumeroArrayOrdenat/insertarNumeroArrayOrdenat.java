package exerciciInsertarNumeroArrayOrdenat;

import java.util.Scanner;

public class insertarNumeroArrayOrdenat {

    Scanner entry = new Scanner(System.in);
    int array[] = new int[9];
    int numeroUsuari, j=0, posicioNumeroUsuari=0;
    boolean ascendent = true;

    public void insertarNumeroArrayOrdenatMetode() {

        omplirArray();
        imprimirArray();
        getNumeroUsuari();
        determinarPosicióCorrecta();
        desplaçarIndex();
        insertarNumeroUsuario();
        imprimirArray();

    }

    private void omplirArray() {

        do {

            for (int i = 0; i < 6; i++) {

                System.out.println("Introdueix un número sencer: ");
                array[i] = entry.nextInt();

            }

            for (int i = 0; i <= 4; i++) {

                if (array[i] < array[i+1]) {

                    ascendent = true;

                } if (array[i] > array[i+1]) {

                    ascendent=false;

                    System.out.println("Torna a començar. Introdueix els números en ordre ascendent, si us plau.");
                    break;
                }
            }

        } while (!ascendent);
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

    private void determinarPosicióCorrecta() { //hauria de fer això: https://www.youtube.com/watch?v=DItML3ijT9k

        while (array[j]<numeroUsuari && j<6) {
            j++;
        }
        posicioNumeroUsuari=j;

    }

    private void desplaçarIndex() {

        for (int i=array.length-2; i>=posicioNumeroUsuari; i--) {

            array[i+1] = array[i];
            System.out.println(i);
        }
    }

    private void insertarNumeroUsuario() {

        array[j] = numeroUsuari;
    }
}
