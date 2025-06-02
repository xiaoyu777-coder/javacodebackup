import java.util.Scanner;


public class WhileDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数:");
        int a = sc.nextInt();
        System.out.println("请输入除数:");
        int b = sc.nextInt();
        int count = 0;

        while (a >= b) {
            a= a - b;
            count++;
        }
        System.out.println("余数是:" + a);
        System.out.println("商是:" + count);
    }
}
