package exerciciCrearDosArraysDelPrimer;

import java.util.Scanner;

public class crearDosArraysDelPrimer {

    Scanner entry = new Scanner (System.in);
    int[] arrayOriginal = new int[11];
    int counter_parells = 0, counter_imparells = 0;
    boolean arraysNousOmplerts = false;

    public void crearDosArraysDelPrimerMetode() {

        omplirArray();
        getCounters();
        createArrayParells();
        createArrayImparells();

    }

    private void omplirArray() {

        for (int i=0; i<arrayOriginal.length; i++) {

            System.out.println("Introdueix el número " + (i+1) + " del teu array:");
            arrayOriginal[i] = entry.nextInt();
        }

        System.out.println("Aquest és l'array original: ");
        for (int i=0; i<arrayOriginal.length; i++) {

            System.out.println(arrayOriginal[i]);
        }
    }

    private void getCounters() {

        for (int i=0; i<arrayOriginal.length; i++) {

            if(arrayOriginal[i] % 2 == 0) {

                counter_parells++;

            } else {

                counter_imparells++;
            }
        }
    }

    private void createArrayParells() {

        int[] arrayParells = new int[counter_parells];
        counter_parells = 0;

        System.out.println("Aquest és l'array de números parells: ");

        for (int i = 0; i < arrayOriginal.length; i++) {

            if (arrayOriginal[i] % 2 == 0) {

                arrayParells[counter_parells] = arrayOriginal[i];
                counter_parells++;
            }
        }

        for (int i=0; i<arrayParells.length; i++) {

            System.out.println(arrayParells[i]);
        }
    }

    private void createArrayImparells() {

        int[] arrayImparells = new int[counter_imparells];
        counter_imparells = 0;

        System.out.println("Aquest és l'array de números imparells: ");

        for (int i = 0; i < arrayOriginal.length; i++) {

            if (arrayOriginal[i] % 2 != 0) {

                arrayImparells[counter_imparells] = arrayOriginal[i];
                counter_imparells++;
            }
        }

        for (int i=0; i<arrayImparells.length; i++) {

            System.out.println(arrayImparells[i]);
        }
    }
}