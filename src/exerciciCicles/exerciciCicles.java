package exerciciCicles;

import java.util.Scanner;

public class exerciciCicles {

    Scanner entry = new Scanner(System.in);
    int numeroUsuari;

    public void exerciciCiclesMetode() {

        getNumeroUsuari();
        parellImparell();
    }

    private int getNumeroUsuari() {

        System.out.println("Introdueix un número sencer: ");
        return numeroUsuari = entry.nextInt();

    }

    private void parellImparell() {

        while (numeroUsuari != 0) {

            if (numeroUsuari % 2 == 0) {

                System.out.println("El número " + numeroUsuari + " és parell.");

            } else {

                System.out.println("El número " + numeroUsuari + " és imparell.");

            }

            getNumeroUsuari();
        }

        System.out.println("Adéu!");
    }
}

