package exerciciDesplaçarIndex;

public class desplaçarIndex {

    int[] array = {1,2,3,4,5,6};
    int index0;

    public void desplaçarIndexMetode() {

        imprimirArray();
        desplaçar();
        imprimirArray();
    }

    private void imprimirArray() {

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n");
    }

    private void desplaçar() {

        index0 = array[0];
        for (int i=0; i<array.length-1; i++) {

            array[i] = array[i+1];
        }

        array[array.length-1] = index0;
    }
}
