package dz.Metods;

public class metods {
    /**
     * Находит квадрат числа
     *
     * @param num число
     * @return число в квадрате
     */
    static int square(int num) {
        return num * num;
    }

    /**
     * Соединяет Имя и Фамилию
     *
     * @param name    Имя
     * @param surname Фамилия
     * @return Имя и Фамилия
     */
    static String printFullName(String name, String surname) {
        return name + " " + surname;
    }

    /**
     * Находит в массиве String самую короткую, длинную строку
     *
     * @param str массив строк
     * @return самая длинная и короткая строка
     */
    static String[] cornerValuesArray(String... str) {

        String[] string = new String[2];

        String longest = str[0];
        String shorts = str[0];

        for (String sttr : str) {
            if (sttr.length() > longest.length()) {
                longest = sttr;
            } else if (sttr.length() < shorts.length()) {
                shorts = sttr;
            }
        }

        string[0] = longest;
        string[1] = shorts;

        return string;
    }

    /**
     * Находит в массиве int максимальное, минимальное значение
     *
     * @param num массив чисел
     * @return максимальное и минимальное значение
     */
    static int[] cornerValuesArray(int... num) {
        int[] nums = new int[2];
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            } else if (num[i] < min) {
                min = num[i];
            }
        }
        int numMax = max;
        int numMin = min;
        nums[0] = numMax;
        nums[1] = numMin;

        return nums;
    }

    /**
     * Находит в массиве char самый маленький и самый большой символ
     *
     * @param chars массив символов
     * @return самый маленький и самый большой символ
     */
    static char[] cornerValuesArray(char... chars) {
        char[] charrrs = new char[2];
        char max = chars[0];
        char min = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > max) {
                max = chars[i];
            } else if (chars[i] < min) {
                min = chars[i];
            }
        }
        char numMax = max;
        char numMin = min;
        charrrs[0] = numMax;
        charrrs[1] = numMin;

        return charrrs;
    }

}
