import java.util.Scanner;

// 定义一个类 ZhiShu1
public class ZhiShu1 {
    // 主方法，程序入口
    public static void main(String[] args) {
        // 创建一个 Scanner 对象，用于获取用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        // 读取用户输入的整数
        int num = sc.nextInt();
        // 定义一个标志变量，初始值为 true
        boolean flag = true;
        // 从 2 开始循环到 num-1，检查 num 是否为质数
        for (int i = 2; i < num; i++) {
            // 如果 num 能被 i 整除，则不是质数
            if (num % i == 0) {
                flag = false; // 设置标志为 false
                break; // 跳出循环
            }
        }
        // 根据标志变量的值输出结果
        if (flag) {
            System.out.println(num + "是一个质数");
        } else {
            System.out.println(num + "不是一个质数");
        }
    }
}
