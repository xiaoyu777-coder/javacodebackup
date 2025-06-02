//1.导包，找到Scannner这个类在哪
import java.util.Scanner;



public class ScannerDemo1 {
    public static void main(String[] args) {
        //2.创建Scanner对象
        //System.in代表从键盘输入
        //只能输入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(a);


    }
}