import java.util.Scanner;

public class calculadora {

    Scanner entry = new Scanner(System.in);
    int x, y, resultat;
    char operacio;

    public void calcula (){

        x = numeroX();
        operacio = charOperacio();

        do {

            if (operacio == 'S') {

                suma();
                accioSeguent();

            } else if (operacio == 'R') {

                resta();
                accioSeguent();

            } else if (operacio == 'P') {

                producte();
                accioSeguent();

            } else if (operacio == 'D') {

                divisio();
                accioSeguent();

            }

        } while (((operacio != 'E') && (operacio != 'C')));

        if (operacio == 'E') {

            System.out.println("Fins la propera!");

        } else if (operacio == 'C') {

            calcula();

        }

    }

    private int numeroX() {

        System.out.println("Intodrodueix un número: ");
        x = entry.nextInt();

        return x;

    }

    private char charOperacio() {

        System.out.println("Introdueix el tipus d'operació que vols realitzar: ('S' per sumar, 'R' per restar, " +
                "'P' pel producte i 'D' per la divisió)");
        operacio = entry.next().charAt(0);

        return operacio;
    }

    private int numeroY() {

        System.out.println("Introdueix el número que vols operar: ");
        y = entry.nextInt();

        return y;

    }

    private int suma() {

        numeroY();
        resultat = x + y;
        x = resultat;

        return x;
    }

    private int resta() {

        numeroY();
        resultat = x - y;
        x = resultat;

        return x;

    }

    private int producte() {

        numeroY();
        resultat = x % y;
        x = resultat;

        return x;

    }

    private int divisio() {

        numeroY();
        resultat = x / y;
        x = resultat;

        return x;

    }

    private char accioSeguent() {

        System.out.println(resultat + "\nPrem E per a sortir.\nPrem C per tornar a començar.\n" +
                "Prem un tipus d'operació per a continuar operant ('S' per sumar, 'R' per restar, \n" +
                "'P' pel producte i 'D' per la divisió).");
        operacio = entry.next().charAt(0);

        return operacio;
    }


}
