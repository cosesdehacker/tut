import java.util.Scanner;

public class keyboard {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Com et dius?");
        System.out.println("Quants anys tens?");
        String nom = entry.nextLine();
        int edat = entry.nextInt();

        System.out.println("Hola " + nom + ". Tens " + edat + " anys, oi?");

    }
}
