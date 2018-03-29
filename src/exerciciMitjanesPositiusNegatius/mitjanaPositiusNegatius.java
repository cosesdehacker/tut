package exerciciMitjanesPositiusNegatius;

import java.util.Scanner;

public class mitjanaPositiusNegatius {

    Scanner entry = new Scanner(System.in);
    int numeroUsuari, positius = 0, elementsPositius, negatius = 0, elementsNegatius, elementsZero;
    float mitjanaPositius, mitjanaNegatius;

    public void mitjanaPositiusNegatiusMetode() {

        for (int i = 1; i < 11; i++) {

            getNumeroUsuari();
            storeNumeroUsuari();
        }

        getMitjanaPositius();
        getMitjanaNegatius();

        System.out.println("Has introduït "+elementsZero+" zeros.\n" +
                "La mitjana dels números positius és "+mitjanaPositius+".\n" +
                "La mitjana dels números negatius és "+mitjanaNegatius+".");
    }

    private int getNumeroUsuari() {

        System.out.println("Introdueix un número sencer: ");

        return numeroUsuari = entry.nextInt();
    }

    private void storeNumeroUsuari() {

        if (numeroUsuari > 0) {
            positius = numeroUsuari + positius;
            elementsPositius++;

        } else if (numeroUsuari < 0) {

            negatius = numeroUsuari + negatius;
            elementsNegatius++;

        } else {

            elementsZero++;
        }
    }

    private float getMitjanaPositius() {

        return mitjanaPositius = positius / elementsPositius;
    }

    private float getMitjanaNegatius() {

        return mitjanaNegatius = negatius / elementsNegatius;
    }
}
