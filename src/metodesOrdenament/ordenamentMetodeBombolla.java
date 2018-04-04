package metodesOrdenament;
 // Serveix per endreçar els elements d'un array

import java.util.Scanner;

public class ordenamentMetodeBombolla {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        int array[] = new int[4];
        int aux;

        System.out.println("Introdueix els elements del teu array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ") ");
            array[i] = entry.nextInt();
        }

        //Algoritme bombolla:

        for (int i = 0; i < array.length - 1; i++) {

            for (int j=0; j< array.length - 1; j++) {

                if (array[j] > array[j + 1]) {

                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        System.out.println("Aquest és l'array endreçat: ");

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}

