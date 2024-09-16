package test1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    static void task1() {
    //         Задача 1. Вывод чётных чисел от 1 до n
    //        Условие: Напишите программу, которая выводит все НЕчётные числа от 1 до заданного числа n.
    //        Пример: Для n = 10 программа должна вывести: 1 3 5 7 9
        int n = 20;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }

    static void task2() {
        //        Задача 2. Произведение чисел от 1 до n
        //        Условие: Напишите программу, которая вычисляет произведение всех чисел от 1 до заданного числа n
        //        Пример: Для n = 4, результат будет 1 * 2 * 3 * 4 = 24.
        int n = 4;
        int composition = 0;
        Integer j;
        for (int i = 1; i <= n; i++) {
            j = composition * i;
            composition += i;
            System.out.println(j);
        }

    }

    static void task3() {
    //        Задача 3. Таблица умножения
    //        Условие: Напишите программу, которая выводит таблицу умножения от 1 до 10 (1 * 1, 1* 2 и т.д. до 10 * 10)
    //        Использовать вложенные циклы for.
        Scanner cs = new Scanner(System.in);
        System.out.print("На что умножим? (1,2,3,4,5,6,7,8,9,10): ");
        int number1 = cs.nextInt();

        for (int i = 1; i < 11; i++) {
            int num = i * number1;
            System.out.println(num);


        }







    }
}
