import java.util.Scanner;

public class condicionals {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Indica el preu");
        double preu = entry.nextDouble();
        System.out.println("Indica el percentatge");
        int percentatge = entry.nextInt();

        if (percentatge < 14) {
            System.out.print("El servei no ha estat massa bo\n ");

        } else {
            System.out.println("El servei ha esta bé");
        }

        System.out.println("Pagarem " + (preu * percentatge / 100) + " en concepte de propina.\n En total, " +
                    (preu + preu * percentatge / 100));

    }
}

