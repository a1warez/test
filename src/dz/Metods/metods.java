package dz.Metods;

public class metods {
    static int square(int num) {
        return num * num;
    }

    static String printFullName(String name, String surname) {
        return name + " " + surname;
    }

    static String cornerValuesArray(String[] str) {

        String[] string = new String[str.length];

        String longest = "";

        for (String sttr : str) {
            if (sttr.length() > longest.length()) {
                longest = sttr;
            }
        }
        String shorts = longest;
        for (String stt : str) {
            if (stt.length() < shorts.length()) {
                shorts = stt;
            }
        }
        string[0] = longest;
        string[1] = shorts;

        return string[0] + " " + string[1];
    }

}
