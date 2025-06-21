import java.util.Random;
import java.util.Scanner;

public class FangFa {
    static void caishuzi() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数字：");
        System.out.println("输入-1退出");
        while (true) {
            int randomNum2 = sc.nextInt();
            if (randomNum2 == -1) {
                System.out.println("退出游戏");
                return;
            }
            if (randomNum2 < randomNum) {
                System.out.println("猜小了");
            } else if (randomNum2 > randomNum) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了!!!");
                System.out.println("还要继续游戏吗？");
                System.out.println("1.继续 2.退出");
                int num = sc.nextInt();
                if (num == 2) {
                    System.out.println("退出游戏");
                    return;
                }else if (num == 1) {
                    caishuzi();
                }else {
                    System.out.println("输入错误");
                }
                break;
            }
        }
    }
    static void FengQiGuo() {
        System.out.println("输入小于100的数字：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);

        }
    }
    public static void main(String[] args) {
        System.out.println("选择游戏：1.猜数字 2.逢7过");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1) {
            caishuzi();
        }else if (num == 2) {
            FengQiGuo();
        }else{
            System.out.println("输入错误");
        }
    }
}
