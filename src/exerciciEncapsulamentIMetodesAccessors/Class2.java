package exerciciEncapsulamentIMetodesAccessors;

public class Class2 {

    public static void main(String[] args) {


        Class1 objecte1 = new Class1();
        //el sistema no em permet fer un 'objecte1.edat = 10;' perquè l'atribut edat és private, PERÒ -->

        objecte1.setEdat(33); //sí puc accedir al mètode setEdat i modificar LOCALMENT l'atribut

        //el sistema no permet fer un 'System.out.println("L'edat és "+edat);' perquè la variable 'edat' és private, PERÒ -->

        System.out.println("L'edat és "+ objecte1.getEdat());
    }
}
