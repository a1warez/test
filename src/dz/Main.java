package dz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] num = {15, 2, 35, 40, 57};

        int a = num.length;
        int b = (a / 2);
        int s = num[b];
        System.out.println("Среднее значение: " + s);

        double[] nums = {5.2, 13.2, 2.6, 9.8, -3.2};

        double max = Arrays.stream(nums).max().getAsDouble();
        System.out.println("Максимальное значение: " + max);
        double min = Arrays.stream(nums).min().getAsDouble();
        System.out.println("Минимальное значение " + min);

    }
}