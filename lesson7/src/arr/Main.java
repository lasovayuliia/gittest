package arr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //task 1
        int[] arr = Arr.generateArray(10);
        int[] minMax = Arr.minMax(arr);
        int min = minMax[0];
        int max = minMax[1];
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("The smallest number: " + min + "\nThe biggest number: " + max);

        //task 2
        int[][] arr2 = Arr.generateTwoArray(3,2);
        System.out.println("\nTwo-dimensional array:");
        Arr.printTwoArray(arr2);
        System.out.println("Array sum: " + Arr.twoArraySumm(arr2));
    }
}
