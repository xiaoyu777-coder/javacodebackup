import java.util.Scanner;


public class SwitchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fruit = sc.nextInt();

        switch (fruit) {
            case 1 -> System.out.println("苹果");


            case 2 -> System.out.println("香蕉");


            case 3 -> System.out.println("橘子");


            default -> System.out.println("没有这个水果");





        }
    }
}