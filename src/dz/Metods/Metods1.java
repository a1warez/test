package dz.Metods;

import java.util.Arrays;

public class Metods1 {
    /** Заполняет двойной массив числами от 1
     *
     * @param array двойной массив
     * @return Наполненный массив
     */
    static int[][] fullArray(int[][] array){
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                num++;
                array[i][j] = num;
            }
        }
        return array;
    }

    /** Выводит двойной массив
     *
     * @param array двойной массив
     */
    static void PrintMatrix(int[][] array){
        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
        }
    }

    /** Считает сумму элементов по строкам и выводит ее в консоль
     *
     * @param array двойной массив
     * @return Сумма элементов по строкам
     */
     static int[][] sumline(int[][] array){
     for (int i = 0; i < array.length; i++) {
     int sum = 0;
     for (int j = 0; j < array[0].length; j++) {
     sum += array[i][j];
     }
     System.out.println("Сумма элементов по строкам: " + sum);
     }
     return array;
     }

    /** Считает сумму элементов по столбцам и выводит ее в консоль
     *
     * @param array двойной массив
     * @return Сумма элементов по столбцам
     */
    static int[][] sumcolumns(int[][] array){
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            System.out.println("Сумма элементов по столбцам: " + sum);
        }
        return array;
    }

    /** Сортирует исходный массив
     *
     * @param array массив
     */
    static void changeArray(int[] array){
        Arrays.sort(array);
    }

    /** Создает копию данного массива и в копии меняет все значения на 6
     *
     * @param array массив
     */
    static void chabgeCopyArray(int[] array){
        int[] numCopy = Arrays.copyOf(array, array.length);
        Arrays.fill(numCopy, 6);
    }
}
