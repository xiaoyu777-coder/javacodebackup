import java.util.Scanner;

public class ScannnerDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter another number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum is: " + c);
    }
}
