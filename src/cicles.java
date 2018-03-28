import java.util.Scanner;

public class cicles {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Quants números vols multiplicar?");
        int numeros = entry.nextInt();

        System.out.printf("Si us plau, introdueix %d números.\n", numeros);

//        for(int i=1; i <=numeros; i++){
//
//            System.out.printf("Introdueix la %da dada: ",i);
//            int num = entry.nextInt();
//            int multiplicacion = num * 3;
//            System.out.printf("Dada %d: %d\n", i, multiplicacion);
//         }

        int c = 1;

        while (c <=numeros) {

            System.out.printf("Introdueix la %da dada: ",c);
            int num = entry.nextInt();
            int multiplicacion = num * 3;
            System.out.printf("Dada %d: %d\n", c, multiplicacion);
            c++;

        }
    }
}
