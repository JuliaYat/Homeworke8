import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        double[] fraction = {1.57, 7.654, 9.986};
        System.out.println(fraction[0]);
        System.out.println(fraction[1]);
        System.out.println(fraction[2]);
        int[] apples = new int[3];
        apples[1] = 2;
        int appelRed = apples[1];
        System.out.println(appelRed);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] no1 = {1, 2, 3, 4};
        for (int i = 0; i < no1.length; i++) {
            if (i == no1.length - 1) {
                System.out.print(no1[i]);
                break;
            }
            System.out.print(no1[i] + ", ");
        }
        System.out.println();
        int[] no2 = {11, 12, 13, 14};
        System.out.print(Arrays.toString(no2));
        System.out.println();
        int[] no3 = {21, 22, 23, 24};
        for (int e = 0; e < no3.length; e++) {
            if (e == no3.length - 1) {
                System.out.print(no3[e]);
                break;
            }
            System.out.print(no3[e] + ", ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] no1 = {1, 2, 3, 4};
        for (int i = no1.length - 1; i >= 0; i = i - 1) {
            if (i == 0) {
                System.out.print(no1[i]);
                break;
            }
            System.out.print(no1[i] + ", ");
        }
        System.out.println();
        int[] no2 = {11, 12, 13, 14};
        for (int q = no2.length - 1; q >= 0; q = q - 1) {
            if (q == 0) {
                System.out.print(no2[q]);
                break;
            }
            System.out.print(no2[q] + ", ");
        }
        System.out.println();
        int[] no3 = {21, 22, 23, 24};
        for (int e = no3.length - 1; e >= 0; e--) {
            if (e == 0) {
                System.out.print(no3[e]);
                break;
            }
            System.out.print(no3[e] + ", ");
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            if (value % 2 !=0) {
                value += 1;
                numbers[i] = value;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}