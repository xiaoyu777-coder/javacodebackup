import java.util.Scanner;

public class FangFa2 {
    static void Test(int age) {
        if (age < 18) {
            System.out.println("拒绝访问");
        }else if (age > 45){
            System.out.println("你太老了");
        }else {
            System.out.println("欢迎访问");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) Test(sc.nextInt());
    }
}
