package metodesOrdenament;

import java.util.Scanner;

public class ordenamentInserció {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int array[], numeroElements, posicio, aux;

        System.out.println("Quants elements vols que tingui el teu array?: ");
        numeroElements = entry.nextInt();

        array = new int[numeroElements];

        System.out.println("Introdueix els elements del teu array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ") ");
            array[i] = entry.nextInt();
        }

        //Algoritme inserció:

        for(int i=0; i<numeroElements; i++) {

            posicio = i;
            aux = array[i];

            while (posicio > 0 && array[posicio-1] > aux) {

                array[posicio] = array[posicio - 1];
                posicio--;
            }

            array[posicio] = aux;

        }

        System.out.println("Aquest és l'array endreçat: ");

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}
