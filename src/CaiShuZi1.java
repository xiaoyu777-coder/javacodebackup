import java.util.Random;
import java.util.Scanner;


public class CaiShuZi1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数字：");
        while (true) {
            count++;
            if (count == 15) {
                System.out.println("游戏结束");
                break;
            }
            int randomNum2 = sc.nextInt();
            if (randomNum2 < randomNum) {
                System.out.println("猜小了");
            } else if (randomNum2 > randomNum) {
                System.out.println("猜大了");
            } else {
                System.out.println("猜对了!!!");
                break;
            }
        }
    }
}
