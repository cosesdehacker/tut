package exerciciCalcularLaMtijana;

import java.util.Scanner;

public class calcularLaMtijana {

    Scanner entry = new Scanner(System.in);

    int notaUsuari, numeroElements;
    int sumaParcial = 0;
    float mitjana;
    boolean continuar = true;
    char cont;

    public void calcularLaMitjanaMetode() {

        while (continuar) {

            getNotaUsuari();
            getNumeroElements();
            continuar();
        }

        printMitjana();
    }

    private int getNotaUsuari() {

        System.out.println("Introdueix la nota: ");
        notaUsuari = entry.nextInt();
        return sumaParcial = notaUsuari + sumaParcial;
    }

    private int getNumeroElements() {

        return numeroElements++;
    }

    private boolean continuar() {

        System.out.println("Vols afegir més notes? S / N");
        cont = entry.next().toUpperCase().charAt(0);

        switch (cont) {

            case 'S':
                continuar = true;
                break;

            default:
                continuar = false;
        }

        return continuar;
    }

    private void printMitjana() {

        mitjana = sumaParcial / numeroElements;
        System.out.println(mitjana);
    }
}
