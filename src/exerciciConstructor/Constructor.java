package exerciciConstructor;

public class Constructor {

    //atributs

    int edat;
    String nom;

    public Constructor(int _edat, String _nom) {

        //mètode constructor
        edat = _edat;
        nom = _nom;

    }

    public void mostrarDades() {

        //mètode normal

        System.out.println("La persona amb nom "+nom+" té "+edat+" anys.");
    }
}
