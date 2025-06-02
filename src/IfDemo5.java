import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的会员等级：");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("输入商品价格：");
            int b = sc.nextInt();
            System.out.println("可以享受9折优惠!!!" + "价格为：" + (b * 0.9));
        } else if (a == 2) {
            int b = sc.nextInt();
            System.out.println("可以享受8折优惠!!!" + "价格为：" + (b * 0.8));
        } else if (a == 3) {
            int b = sc.nextInt();
            System.out.println("可以享受7折优惠!!!" + "价格为：" + (b * 0.7));
        }else if (a < 1 || a > 3) {
            System.out.println("错误");
        }
    }

}
