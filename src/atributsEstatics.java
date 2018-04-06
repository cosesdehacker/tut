public class atributsEstatics {

    //membres estàtics d'una classe = membres d'una classe
    //aquí veurem el comportament dels atributs depenent de si són estàtics o no

    public String Estatic1 = "Primera frase";
    public static String Estatic2 = "Primera línia";


    public static void main(String[] args) {

        System.out.println(Estatic2); //com que és static pertany a la classe (no a l'objecte) i puc cridar-lo directament
                                      //com que Estatic1 no pertany a la classe sinó a l'objecte al què li assignem,
                                      //si vull fer-lo servir he de crear un objecte

        atributsEstatics objecte1 = new atributsEstatics();
        System.out.println(objecte1.Estatic1); //ara sí puc fer servir l'atribut perquè he creat la classe

        //si vull que el valor de l'atribut no estatic sigui diferent per un altre objecte, és fàcil:

        atributsEstatics objecte2 = new atributsEstatics();
        objecte2.Estatic1 = "Segona frase";

        //si ara imprimeixo l'atribut no estàtic de cadascun dels dos objectes, serà diferent per a cadascun d'ells, perquè
        //els canvis s'apliquen a l'atribut que és part de l'objecte, no a la classe

        System.out.println("L'atribut no estàtic que he modificat assignat a l'objecte2és "+objecte2.Estatic1);
        System.out.println("L'atribut no estàtic aplicat a l'objecte1 és "+objecte1.Estatic1);

        //EN CANVI, si faig canvis a un atribut estàtic, com que l'atribut pertany a la classe, els canvis es faran
        //efectius en l'atribut, s'apliqui a l'objecte que s'apliqui

        System.out.println("L'atribut estàtic original és" +objecte1.Estatic2);

        objecte2.Estatic2="Segona línia";

        System.out.println("L'atribut estàtic modificat assignat a l'objecte2 és "+objecte2.Estatic2);
        System.out.println("L'atribut estàtic aplicat a l'objecte1 és "+objecte1.Estatic2);

        //aquí veurem el comportament dels mètodes depenent de si són estàtics o no (els mètodes estan més a baix)


        System.out.println(objecte1.sumar(4,7));
        System.out.println(restar(9,2)); //com que 'restar' és un mètode estàtic, no necessito assignar-li a un objecte
        System.out.println(objecte1.sumar(9,3));

    }

    private int sumar(int n1, int n2){

        int suma = n1+n2;
        return suma;
    }

    public static int restar(int n3, int n4){

        int resta = n3-n4;
        return resta;
    }
}
