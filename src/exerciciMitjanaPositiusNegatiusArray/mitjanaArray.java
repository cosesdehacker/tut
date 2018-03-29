package exerciciMitjanaPositiusNegatiusArray;

import javax.swing.*;

public class mitjanaArray {

    int[] array = new int[9];
    int elementsArray, positius = 0, elementsPositius = 0, mitjanaPositius, negatius = 0,
            elementsNegatius = 0, mitjanaNegatius, elementsZero = 0;

    public void mitjanaArrayMetode() {

        getElementsArray();
        classifyElementsArray();
        mitjanes();
        printMitjanes();

    }

    private void getElementsArray() {

        for (int i=0; i<array.length; i++) {

            elementsArray = Integer.parseInt(JOptionPane.showInputDialog("Introdueix els elements del teu array: "));
            array[i] = elementsArray;

        }
    }

    private void classifyElementsArray() {

        for (int i=0; i<array.length; i++) {

            if (array[i] < 0) {

                elementsNegatius++;
                negatius = array[i]+negatius;

            } else if (array[i] > 0) {

                elementsPositius++;
                positius = array[i]+positius;

            } else {

                elementsZero++;
            }
        }
    }

    private void mitjanes() {

        mitjanaPositius = positius / elementsPositius;
        mitjanaNegatius = negatius / elementsNegatius;

    }

    private void printMitjanes() {

        System.out.println("La mitjana dels números positius que has intrduït és "+mitjanaPositius+
        "\nLa mitjana dels números negatius que has introduït és "+mitjanaNegatius+
        "\nHas introduït "+elementsZero+" zeros.");
    }
}
