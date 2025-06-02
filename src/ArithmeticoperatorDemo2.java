import java.util.Scanner;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The 3 number is: ");
        System.out.println(num % 10);
        System.out.println("The 2 number is: ");
        System.out.println(num / 10 % 10);
        System.out.println("The 1 number is: ");
        System.out.println(num / 100 % 10);


    }
}
