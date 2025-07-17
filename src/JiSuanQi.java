import java.util.Random;
import java.util.Scanner;

public class JiSuanQi {
    static void jiafa(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入第一个数字（或者按'q'退出）");
            String a = sc.nextLine();
            if (a.equals("q")){
                break;
            }
            System.out.println("请输入第二个数字");
            String b = sc.nextLine();
            System.out.println("两数相加结果为：" + (Integer.parseInt(a) + Integer.parseInt(b)));
        }
    }
    static void jianfa(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入第一个数字（或者按'q'退出）");
            String a = sc.nextLine();
            if (a.equals("q")){
                break;
            }
            System.out.println("请输入第二个数字");
            String b = sc.nextLine();
            System.out.println("两数相减结果为：" + (Integer.parseInt(a) - Integer.parseInt(b)));
        }
    }
    static void random(){
        System.out.println("请输入你要生成的随机数的个数");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int randomNumber = random.nextInt(100) + 1; // 生成0到100之间的随机整数
            System.out.println(randomNumber);
        }
    }
    public static void main(String[] args) {
        System.out.println("选择你要进行的数学技术（1.加法 2.减法 3.随机数生成器）：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 == 1) {
            jiafa();
        }
        else if (num1 == 2){
            jianfa();
        }
        else if (num1 == 3){
            random();
        }
        else {
            System.out.println("输入错误");
        }
    }
}
