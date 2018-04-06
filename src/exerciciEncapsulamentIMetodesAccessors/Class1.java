package exerciciEncapsulamentIMetodesAccessors;

//encapsulament = pràctica d'ocultar dades amb modificadors d'accès per tal que no tothom pugui modificar-los
//mètodes accessors (Setters i Getters) = serveixen per a què els atributs puguin ser accedits des d'altres classes
//per fer-los servir allà de forma local

public class Class1 {

    private int edat; // aquest atribut no es pot fer capturar des d'una altra classe

    public void setEdat(int edat) {

        this.edat = edat;
    }

    public int getEdat(){

        return edat;
    }
}
