package exerciciConstructorThis;

public class ConstructorThis {
    //atributs

    int edat;
    String nom;

    public ConstructorThis(int edat, String nom) { //en comparació amb exerciciConstructor, hem posat als paràmetres
                                                   //el mateix nom que als atributs globals

        //mètode constructor
        this.edat = edat;
        this.nom = nom; //si deixem edat=edat i nom=nom Java no sap què fer, però si afegim el this li estem dient:
                        //"el valor que introdueixi al paràmetre edat servirà per inicialitzar la variable global 'edat'.
                        //En realitat sona una mica al revés, perquè this.edat=edat equival a
                        // 'aquella variable global edat' s'inicialitza amb 'aquest paràmetre'

    }

    public void mostrarDades1() {

        //mètode normal

        System.out.println("La persona amb nom "+nom+" té "+edat+" anys.");
    }
}
