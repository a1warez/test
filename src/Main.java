import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        System.out.print("Введи 1 если нужы шины для лета и введи 2 если для зиммы:  ");
        int a = cs.nextInt();


        if (a == 1) {

            System.out.println("Могу посоветовать на лето таких производителей как Nokian, Pirelli.  ");
        }
        if (a > 1) {

            System.out.print("Введи 1 если нужы шиповоные или введи 2 если нужны 'липучки':  ");
            int b = cs.nextInt();
            if (b == 1) {

                System.out.println("Шиповоные хороши такие как Gislaved, Toyo.");

            }
            if (b > 1) {

                System.out.println("Липучки хороши  такие как Dunlop, Continental.");
            }
        }














    }
}
