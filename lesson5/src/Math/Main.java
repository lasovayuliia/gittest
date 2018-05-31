package Math;

public class Main {

    public static void main(String[] args) {
        //Операции с присваиванием
        int first = 25;
        double second = first / 5;
        second *= 1.5;
        int third = (int) (second + 10 * Math.random());
        third %= 5;

        //Инкрементирование и декрементирование
        int num = 10;
        num--; //уменьшили на 1 -> 10-1=9
        System.out.println("Инкрементирование и декрементирование:");
        System.out.println(num + " - должно быть 9"); //выведет 9
        System.out.println(num++ + " - и все еще 9"); //все еще 9, потому что мы сначала вывели, а затем увеличили значение
        System.out.println(++num + " - а теперь 11"); //в прошлый раз вывели 9, но записали 10, теперь мы сначала увеличили до 11, а затем вывели
        System.out.println(--num - num++); // сначала делаем 10 - 10 и получаем 0, его и выводим, затем 10 + 1 = 11
        System.out.println(num); //выводим 11

        System.out.println("\nМатематические операции:");
        final int CONST_1 = 9;
        System.out.println("Квадратный корень из константы: " + Math.sqrt(CONST_1));
        System.out.println("Константа в степени 3: " + Math.pow(CONST_1, 3));
        System.out.println("Косинус числа Пи: " + Math.cos(Math.PI));

        System.out.println("\nЗадание 4:");
        /*Добавить переменную char x='B';
        Увеличить и вывести в консоль инкремент/декремент переменной.
        Добавить в выводу на консоль перевод строки и табуляцию.*/
        char x = 'B';
        System.out.print("\t" + --x + "\n");
        x++;
        System.out.print("\t" + ++x + "\n");

        System.out.println("\nЗадание 5:");
        //Известны катеты прямоугольного треугольника, найти его площадь и периметр.
        double a = 3; //длина первого катета
        double b = 4; //длина второго катета
        System.out.println("Длины катетов: " + a + " и " + b);
        System.out.println("Площадь треугольника: " + Triangle.rightSquare(a, b));
        System.out.println("Периметр треугольника: " + Triangle.rightPerimeter(a, b));
    }
}
