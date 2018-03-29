package exerciciBarrejarElementsArray;

public class barrejarElementsArray {

    int[] arrayA = {2,4,6,8,10,12,14};
    int[] arrayB = {1,3,5,7,9,11,13};
    int[] arrayC = new int[arrayA.length+arrayB.length];

    public void barrejarElementsArrayMetode() {

        barreja();
        printArrays();
        System.out.println(arrayA[3]);
    }

    private int[] barreja() {

        int counter = 0;

        for (int i=0; i<arrayA.length; i++) {

            arrayA[i] = arrayC[counter];
            counter++;
            arrayB[i] = arrayC[counter];
            counter++;
        }

        return arrayC;
    }

    private void printArrays() {

        for (int x=0; x<arrayA.length; x++) {
            System.out.println(arrayA[x]);
        }

        for (int i=0; i<arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }

        for (int i=0; i<arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
    }
}
