package arr;

import java.util.Arrays;
import java.util.*;

//import static java.lang.String.valueOf;

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
        System.out.println("Task 4:");
        String[] arr4 = {"Save", "boss", "KISS", "lost", "MESS"};
        System.out.println("String array: " + Arrays.toString(arr4));
        System.out.println("String concat: " + Arr.strConcat(arr4));
        System.out.println("String concat with S: " + Arr.strConcatWithS(arr4));

        //task5
        System.out.println("\nTask 5:");

        /*Map<Integer, Phonebook> map = new HashMap<Integer, Phonebook>();
        Phonebook code1 = new Phonebook("Ukraine",  "38");
        Phonebook code2 = new Phonebook("Russia", "7");
        Phonebook code3 = new Phonebook("Belarus",  "375");

        map.put(1, code1);
        map.put(2, code2);
        map.put(3, code3);*/


        String tel = "38-063-8383838";
        String tel2 = "38-04622-56789";
        String tel3 = "7-04622-56789";
        String tel4 = "375-04622-56789";
        UserNumber.parseNumber(tel);
        UserNumber.parseNumber(tel2);
        UserNumber.parseNumber(tel3);
        UserNumber.parseNumber(tel4);
        /*for (Map.Entry<Integer, Phonebook> entry : map.entrySet()) {
            Phonebook p = entry.getValue();
            if (tel.contains(p.code)) {
                System.out.println("Country: " + p.country + "\nOperator: " + p.operator);
                UserNumber u1 = new UserNumber(tel);
            }
        }*/
    }
}
