package numeroAlQuadrat;

import javax.swing.*;

public class numeroAlQuadrat {

    int numeroUsuari, numeroQuadrat;

    public void numeroAlQuadratMetode() {

        numeroUsuari();

        while (numeroUsuari >= 0) {
            pow();
            numeroUsuari();

        }

        JOptionPane.showMessageDialog(null, "Fins la propera!");
    }

    private int numeroUsuari() {

        numeroUsuari = Integer.parseInt(JOptionPane.showInputDialog("Introdueix un número sencer: "));

        return numeroUsuari;
    }

    private void pow() {

        numeroQuadrat = (int) Math.pow(numeroUsuari,numeroUsuari);
        JOptionPane.showMessageDialog(null, ""+numeroQuadrat);

    }
}
