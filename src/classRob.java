import java.util.Scanner;

public class classRob {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введи свой возраст: ");
        int usersAge = cs.nextInt();

        if (usersAge>=2 && usersAge<=6){
            System.out.println("Детский сад");
        } else if (usersAge>=0 && usersAge<=1) {
            System.out.println("Оштбка!");
        }


        String school;
        school = switch (usersAge){
            case 7,8,9,10,11,12,13,14,15,16,17,18 -> "Если возраст человека равен от 7 до 18, то ему нужно посещать школу.";
            default -> "";
        };
        System.out.println(school);

        if (usersAge>=19 && usersAge<=24){
            System.out.println("Если возраст человека старше 18 но мнладше 24, то ему нужно учиться в университете.");
        }
        if (usersAge > 24){
            System.out.println("Если возраст человека равен 24 или больше, то ему пора идти на работу.");
        }


        System.out.print("Введи номер месяца:  ");
        int monthNumber = cs.nextInt();
        String namesMonth;
        namesMonth = switch (monthNumber){
            case 1,2,12 -> "Принадлежит к сезону зима";
            case 3,4,5 -> "Принадлежит к сезону весна";
            case 6,7,8 -> "Принадлежит к сезону лето";
            case 9,10,11 -> "Принадлежит к сезону осени";
            default -> "";
        };
        System.out.println(namesMonth);

        int diana = 66660;
        int andrei = 77770;
        int mariya = 88880;
        double app = 0.15;

        int productDiana = (int) (diana * app); // сколько прибавки к зп
        int sumDiana = diana + productDiana; // новая зп месец
        int differenceDiana = productDiana * 12;
        System.out.println("Диана теперь получает " + sumDiana + " рублей. Годовой доход вырос на " + differenceDiana + " рублей");

        int productAndrei = (int) (andrei * app);
        int sumAndrei = andrei + productAndrei;
        int differenceAndrei = productAndrei * 12;
        System.out.println("Андрей теперь получает " + sumAndrei + " рублей. Годовой доход вырос на " + differenceAndrei + " рублей");

        int productMariya = (int) (mariya * app);
        int sumMariya = mariya + productMariya;
        int differenceMariya = productMariya * 12;
        System.out.println("Андрей теперь получает " + sumMariya + " рублей. Годовой доход вырос на " + differenceMariya + " рублей");





    }
}
