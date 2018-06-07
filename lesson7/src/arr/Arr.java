package arr;

public class Arr {

    public static int[] generateArray(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = (int) (Math.random() * 100 - 50);
        }
        return arr;
    }

    public static int[] minMax(int[] arr) {
        int max = arr[0];
        int min = max;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static int[] arrBubbleSortDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    int buff = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = buff;
                }
            }
        }
        return arr;
    }

    public static int[][] generateTwoArray(int row, int column) {
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
        return arr;
    }

    public static void printTwoArray(int[][] arr) {
        for (int[] row : arr) {
            for (int anAnArr : row) {
                System.out.print(anAnArr + "\t");
            }
            System.out.println();
        }
    }

    public static int twoArraySumm(int[][] arr) {
        int summ = 0;
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                summ += anAnArr;
            }
        }
        return summ;
    }

    public static String strConcat(String[] arr) {
        String s = "";
        for (String elem : arr) {
                s = s.concat(elem);
            }
        return s;
    }

    public static String strConcatWithS(String[] arr) {
        String s = "";
        for (String elem : arr) {
            if (elem.contains("S")) {
                elem = elem.replace("S", "@");
                s = s.concat(elem);
            }
        }
        return s;
    }
}
