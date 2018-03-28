import java.util.Random;
import java.util.Scanner;

public class numeroExacteTutorial {

    private Scanner entry = new Scanner(System.in);
    private boolean jocActiu = true;
    private Random number = new Random();


    public void jugar () {

        int numeroExacte = obtenirNumeroAleatori(0, 13);
        int counter = 1;
        String nomJugador = obtenirNomJugador();

        System.out.println("Aviam, " + nomJugador + ": si endevines el número en menys de 4 intents, aquesta nit " +
                "et faig el sopar.");

        while (jocActiu) {

            int numeroJugador = obtenirNumeroJugador();

            if (counter==4) {
                System.out.println("Ui... estàs a un intent de perdre't un sopar espectacular.");
            }

            if (counter==5) {
                System.out.println("Llàstima! Adéu sopar!");
            }

            if (numeroJugador <14) {

                if (numeroJugador == numeroExacte) {
                    System.out.printf("Molt bé! Ho has aconseguit en %d intents!", counter);

                    if (counter > 4) {
                        System.out.println("Ja que no cuinaré per a tu, com a mínim et quedarà l'orgull d'haver guanyat a un joc de merda.");

                    } else {
                        System.out.println("Victòria i sopar! Toma ja!");

                    }

                jocActiu = jugarDeNou();

                } else if (numeroJugador < numeroExacte) {
                    System.out.println("Hauràs de provar amb un número més alt.");
                    counter++;

                } else {
                    System.out.println("Hauràs de provar amb un número més baix.");
                    counter++;
                }
            } else {
                System.out.println("Has d'introduir un número entre 0 i 13.");
            }

        }

    }

    private int obtenirNumeroAleatori(int Low, int High) {

        return number.nextInt(High-Low) + Low;

    }

    private String obtenirNomJugador() {

        System.out.println("Com et dius?");
        String nomJugador = entry.nextLine();
        return nomJugador;
    }

    private int obtenirNumeroJugador() {

        System.out.println("Introdueix un número del 0 al 13.");
        return entry.nextInt();
    }

    private boolean jugarDeNou() {

        System.out.println("Vols tornar a jugar?\n1.Sí 2.No");
        int tornar = entry.nextInt();
        if (tornar == 1) {
            return true;

        } else {
            return false;
        }

    }
}
