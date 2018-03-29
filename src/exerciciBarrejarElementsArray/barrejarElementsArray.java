package exerciciBarrejarElementsArray;

public class barrejarElementsArray {

    int[] arrayA = {2,4,6,8,10,12,14};
    int[] arrayB = {1,3,5,7,9,11,13};
    int[] arrayC = new int[arrayA.length+arrayB.length];

    public void barrejarElementsArrayMetode() {

        barreja();
        printArrays();
    }

    private int[] barreja() {

        int counter = 0;

        for (int i=0; i<arrayA.length; i++) {

            arrayC[counter] = arrayA[i];
            counter++;
            arrayC[counter] = arrayB[i];
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
