package exerciciIndicaOrdreArray;

import javax.swing.*;

public class indicaOrdreArray {

    int[] array = new int[6];
    boolean checkIncrease = false, checkDecrease = false;

    public void indicaOrdreArrayMetode() {

        getNumerosArray();
        determinaOrdreArray();
    }

    private void getNumerosArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = Integer.parseInt(JOptionPane.showInputDialog("Escriu els números que vols incloure a l'array: "));
        }

        for (int i : array) {
            System.out.println(i);
        }
    }

    private void determinaOrdreArray() {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] < array[i + 1]) {

                checkIncrease = true;
            }

            if (array[i] > array[i + 1]) {

                checkDecrease = true;
            }
        }

        if (checkIncrease && !checkDecrease) {

            System.out.println("Els números d'aquest array estan en ordre creixent.");

        } else if (!checkIncrease && checkDecrease) {

            System.out.println("Els números d'aquest array estan en ordre decreixent.");

        } else if (checkIncrease && checkDecrease) {

            System.out.println("Els números d'aquest array estan desendreçats.");

        } else if (!checkIncrease&& !checkDecrease) {

            System.out.println("Tots els números d'aquest array són iguals.");
        }
    }
}
