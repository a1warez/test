package test1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    static void task1() {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите текст для получить реверса и сравнения с исходными данными: ");
        String strings = cs.next();
        StringBuilder sb = new StringBuilder();

        for (int i = strings.length()-1; i >= 0; i--){
            sb.append(strings.charAt(i));
        }
        if (sb.equals(sb)){
            System.out.println("Палигдром ");
        }else {
            System.out.println("Не палиндром");
        }
        System.out.println(sb);
    }
    static void task2(){
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите текст на проверку палиндрома: ");
        String st = cs.next();

        boolean isPol = true;

        for (int i = 0; i < (st.length() / 2); i++){
            if (st.charAt(i) == st.charAt(((st.length() - 1) - i))){
                continue;
            }
            isPol = false;
            break;
        }
        if (isPol){
            System.out.println("Палиндром");
        }else {
            System.out.println("Не палиндром");
        }
    }

    static void task3(){
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите число на проверку палиндрома: ");
        Integer num = cs.nextInt();
        String st = String.valueOf(num);
        boolean isPol = true;

        for (int i = 0; i < (st.length() / 2); i++){
            if (st.charAt(i) == st.charAt(((st.length() - 1) - i))){
                continue;
            }
            isPol = false;
            break;
        }
        if (isPol){
            System.out.println("Палиндром");
        }else {
            System.out.println("Не палиндром");
        }



    }
}
