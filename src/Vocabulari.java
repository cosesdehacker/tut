/* CONVENCIÓ:

Classe
nomMetode
varibale_dins_classe
 */

public class Vocabulari { //classe

    //les variables indicades aquí s'anomenen variables GLOBALS***
    int numero; //atribut
    String color; //atribut

    public static void main(String[] args) { //mètode

        Vocabulari cotxe = new Vocabulari(); //objecte

        cotxe.color = "blanc";//definir atributs de l'objecte
        cotxe.numero = 2;//definir atributs de l'objecte

        System.out.println("El color del cotxe és "+cotxe.color);


    }

    public void accelerar() {//public = modificador d'accès; void = valor retorn; accelerar = nom metode;
        // ()=arguments (=dades amb què el mètode treballarà)

        String tipus_carretera; //les variables indicades dins un mètode s'anomenen variables LOCALS***
    }


    public void setNumero() { //declaració del mètode**

        Vocabulari cotxe1 = new Vocabulari();

        cotxe1.accelerar(); //invocació del mètode**

    }

    public void metode (int km, String velocitat) { //entre parèntesi, PARÀMETRES = declarar variables*

    }

    public void motocicleta() {

        Vocabulari moto = new Vocabulari();
        moto.metode(12, "km/h"); //entre parèntesi, ARGUMENTS = inicialitzar variables*
    }

    public Vocabulari(){ //mètode constructor

        /* característiques del mètode constructor:
            - té el mateix nom que la classe;
            - no retorna res però NO és void (és l'únic mètode en què no s'ha d'indicar el valor de retorn);
            - ha de ser públic
         */
    }
    public void bicicleta() {

        Vocabulari bici = new Vocabulari(); // Vocabulari() = constructor


    }


}
