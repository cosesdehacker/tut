package exerciciConstructor;

public class ContructorMain {

    public static void main(String[] args) {

        Constructor persona1 = new Constructor(33, "Cris");
        Constructor persona2 = new Constructor(85, "María");
        Constructor persona3 = new Constructor(12, "Roger");

        persona1.mostrarDades();
        persona2.mostrarDades();
        persona3.mostrarDades();
    }
}
