package exerciciModificadorsAcces.package1;

public class Class2 {

    public static void main(String[] args) {

        Class1 objecte1 = new Class1();

        objecte1.ciutat="Barcelona"; // puc accedir a 'ciutat' perquè està dins d'una class public dins el meu package
        objecte1.animal="gat";       // puc accedir a 'animal' perquè està dins d'una class public dins el meu package
                                     // NO puc accedir a 'transport' perquè té modificador private

    }
}
