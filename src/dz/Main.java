package dz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    static void task1(){
        int[] num = {15, 2, 35, 40, 57};

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

        }
        int average = sum / num.length;

        System.out.println("Среднее арефметическое значение: " + average);
    }
    static void task2(){
        double[] numbers = {5.2, 13.2, 2.6, 9.8, -3.2};
        double min = numbers[0];
        double max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Макимальнон значение: " + max);
        System.out.println("Минемальное значение:" + min);
    }
    static void task3(){
        char[] chars = {'a', 'B', 'i', 'E', 'r', 't', 'o', 'U'};

        int sum = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                sum++;
            }
            if (chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                sum++;
            }
        }
        System.out.println("Количество гласных букв: " + sum);

    }
    static void task4(){
        String str = "Hello World This Is Java";
        char[] charstr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charstr[i] = str.charAt(i);

        }
        for (int i = 0; i < charstr.length; i++) {
            if (charstr[i] == ' ') {
                charstr[i] = '_';
            }
        }
        System.out.println(Arrays.toString(charstr));
    }

    static void task5() {
        String str = "apple,banana,grep,orange";
        String[] strings = str.split("[,\\s]+");
        System.out.println(Arrays.toString(strings));

    }
}