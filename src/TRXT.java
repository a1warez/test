public class TRXT {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {

        String text = "He11o Wor1d!";

        int lowerCase = 0;
        int upperCase = 0;
        int countDigit = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                ++lowerCase;
            }
            if (Character.isUpperCase(text.charAt(i))){
                ++upperCase;
            }
            if (Character.isDigit(text.charAt(i))) {
                ++countDigit;
            }


        }
        System.out.println("Кол во маленьких букв " + lowerCase);
        System.out.println("Кол во больших букв " + upperCase);

        System.out.println("Кол во цифр " + countDigit);

    }

    static void task2() {

        String text = "I like Java!!!";
        char resul;
        resul = text.charAt(8);
        System.out.println(resul);
        if (text.endsWith("!!!")) {
            System.out.println("Последний символы:= \"!!!\" ");
        } else {
            System.out.println("Последним символом не является:= \"!!!\" ");
        }
        if (text.startsWith("I like")) {
            System.out.println("Начало строчки начинается с:=  \"I like\" ");
        } else {
            System.out.println("Начало строчки не начинается с:=  \"I like\" ");
        }
        if (text.contains("Java")) {
            System.out.println("Содержит подстроку \"Java\" ");
        } else {
            System.out.println("Не содержит подстроку \"Java\" ");
        }
        String positions;
        positions = String.valueOf(text.indexOf("Java"));
        System.out.println(positions);

        String replacement;
        replacement = text.replace("a", "o");
        System.out.println(replacement);

        String uppCase = text.toUpperCase();
        System.out.println("UpperCase: " + uppCase);
        String lowerCese = text.toLowerCase();
        System.out.println("LowerCase: " + lowerCese);

    }

    static void task3() {
        String textString = "String";
        String subSTR = textString.substring(2,4);
        System.out.println(subSTR);

        String textCode = "Code";
        String subCODE = textCode.substring(1,3);
        System.out.println(subCODE);

        String textPractice = "Practice";
        String subPractice = textPractice.substring(3,5);
        System.out.println(subPractice);

        String textJava = "Java";
        String subJava = textJava.substring(1,3);
        System.out.println(subJava);

        String textPython= "Python";
        String subPython = textPython.substring(2,4);
        System.out.println(subPython);















    }
}


