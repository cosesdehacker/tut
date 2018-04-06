package exerciciModificadorsAcces.package2;

import exerciciModificadorsAcces.package1.Class1; //s'activa això automàticament en crear l'objecte *

public class Class3 {

    public static void main(String[] args) {

        Class1 objecte1 = new Class1(); //*
        objecte1.ciutat="Berlin"; // puc accedir a 'ciutat', perquè té el modificador public
                                  // NO puc accedir a 'animal' perquè no té modificador
                                  // NO puc accedir a 'transport' perquè té modificador private


    }
}
