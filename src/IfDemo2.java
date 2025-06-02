import java.util.Scanner;


public class IfDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money: ");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("You can go to KFC");
        }
        else {
            System.out.println("You can't go to KFC");
        }

    }
}
