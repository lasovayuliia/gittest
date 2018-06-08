package arr;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println("Task 1:");
        int[] arr = Arr.generateArray(10);
        int[] minMax = Arr.minMax(arr);
        int min = minMax[0];
        int max = minMax[1];
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("The smallest number: " + min + "\nThe biggest number: " + max);

        //task2
        System.out.println("\nTask 2:");
        int[][] arr2 = Arr.generateTwoArray(3, 2);
        System.out.println("Two-dimensional array:");
        Arr.printTwoArray(arr2);
        System.out.println("Array sum: " + Arr.twoArraySumm(arr2));

        //task3
        System.out.println("\nTask 3:");
        int[] arr3 = Arr.generateArray(20);
        System.out.println("Array: " + Arrays.toString(arr3));
        int[] arrSorted = Arr.arrBubbleSortDesc(arr3);
        System.out.println("Sorted array: " + Arrays.toString(arrSorted));

        //task4
        System.out.println("\nTask 4:");
        String[] arr4 = {"Save", "boss", "KISS", "lost", "MESS"};
        System.out.println("String array: " + Arrays.toString(arr4));
        System.out.println("String concat: " + Arr.strConcat(arr4));
        System.out.println("String concat with S: " + Arr.strConcatWithS(arr4));

        //task5
        System.out.println("\nTask 5:");
        String tel = "375-17-8383838";
        String tel2 = "375-25-2562789";
        String tel3 = "7-495-567891";
        String tel4 = "380-44-5678900";
        String tel5 = "0-44-5678900";
        String tel6 = "7-44-5678900";
        Phonebook.parseNumber(tel);
        Phonebook.parseNumber(tel2);
        Phonebook.parseNumber(tel3);
        Phonebook.parseNumber(tel4);
        Phonebook.parseNumber(tel5);
        Phonebook.parseNumber(tel6);
    }
}
