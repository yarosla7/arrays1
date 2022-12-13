import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        /*Задача 1
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        3. Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
         с помощью ключевого слова или сразу заполненный элементами.*/

        System.out.println("\nЗадача_1:");

        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        System.out.println(num[1] + " - первый массив.");

        double[] num1 = {1.57, 7.654, 9.986};
        for (double v : num1) {
            System.out.print(v + " ");
        }
        System.out.print(" - второй массив.");
        System.out.println(" ");

        int[] lost = new int[6];
        lost[0] = 4;
        lost[1] = 8;
        lost[2] = 15;
        lost[3] = 16;
        lost[4] = 23;
        lost[5] = 42;
        for (int i = 0; i < lost.length; i++) {
            System.out.print(lost[i] + " ");
        }
        System.out.print(" - третий массив.");
    } //done

    public static void task2() {

        /*Задача 2
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.*/

        System.out.println("\n\nЗадача_2:");

        int[] num = new int[]{1, 2, 3};

        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.print(num[i]);
                break;
                //          } else {
                //            System.out.print(num[i]);
            }
            System.out.print(num[i] + ", ");
        }
        System.out.println(" ");

        double[] num1 = {1.57, 7.654, 9.986};
        for (int w = 0; w < num1.length; w++) {
            if (num1[w] < num1[2]) {
                System.out.print(num1[w] + ", ");
            } else {
                System.out.print(num1[w]);
            }
        }
        System.out.println(" ");

        int[] lost = new int[]{4, 8, 15, 16, 23, 42};
        for (int l = 0; l < lost.length; l++) {
            if (lost[l] < lost[5]) {
                System.out.print(lost[l] + ", ");
            } else {
                System.out.print(lost[l]);
            }
        }
    } //done

    public static void task3() {

        /*Задача 3
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
        Если в задаче № 2 в консоль у вас вывелся результат:
        1, 2, 3
        1.57, 7.654, 9.986
        // произвольные элементы третьего массива,
        то в этой задаче результат должен быть таким:
        3, 2, 1
        9.986, 7.654, 1.57
        // произвольные элементы третьего массива в обратном порядке*/

        System.out.println("\n\nЗадача_3:");

        int[] num = {1, 2, 3};
        for (int i = 2; i >= 0; i--) {
            if (num[i] > num[0]) {
                System.out.print(num[i] + ", ");
            } else {
                System.out.print(num[i]);
            }

        }
        System.out.println(" ");

        double[] num1 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0; i--) {
            if (num1[i] > num1[0]) {
                System.out.print(num1[i] + ", ");
            } else {
                System.out.println(num1[1]);
            }

        }

        int[] lost = new int[]{4, 8, 15, 16, 23, 42};
        for (int i = 5; i >= 0; i--) {
            if (lost[i] > lost[0]) {
                System.out.print(lost[i] + ", ");
            } else {
                System.out.println(lost[i]);
            }
        }

    } //done

    public static void task4() {

        /*Задача 4
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.*/

        System.out.println("\nЗадача_4:");

        int[] num = {1, 2, 3};
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i] += 1;
            }
        }
        System.out.print(Arrays.toString(num));
    } //done
}