import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*byte myByte = 20;
        short myShort = 5;
        int myInt = 10;
        long myLong = 6;
        float myFloat = 5.5f;
        double myDouble = 15.2;
        char myChar = 'F';
        boolean myBoolean = true; //(false)*/

        Scanner cs = new Scanner(System.in);

        System.out.print("Введи первое число:  ");
        int a = cs.nextInt();

        System.out.print("Введи второе число:  ");
        int b = cs.nextInt();

        int sum = a + b;
        System.out.println("Ответ суммы:" + sum);
        int differ = a - b;
        System.out.println("Ответ вычитания:" + differ);
        int product = a * b;
        System.out.println("Ответ умножения:" + product);
        int quotient = a / b;
        System.out.println("Ответ деоения:" + quotient);
        int remain = a % b;
        System.out.println("Ответ остатка:" + remain);


        long myLong = 3000000000L;
        System.out.println("myLong - " + myLong);
        int myInt = (int) myLong;
        System.out.println("myInt - " + myInt);


        Random random = new Random();

        int randomNumber1 = random.nextInt();
        char ranNum1 = (char) randomNumber1;
        //System.out.print(ranNum1);
        int randomNumber2 = random.nextInt();
        char ranNum2 = (char) randomNumber2;
        //System.out.print(ranNum2);
        int randomNumber3 = random.nextInt();
        char ranNum3 = (char) randomNumber3;
        //System.out.print(ranNum3);
        int randomNumber4 = random.nextInt();
        char ranNum4 = (char) randomNumber4;
        //System.out.print(ranNum4);
        System.out.print("Рандом: " + ranNum1 + ranNum2 + ranNum3 + ranNum4);





    }
}
