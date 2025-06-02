import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
        // 创建Scanner对象用于接收用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int a = sc.nextInt();    // 获取用户输入的整数
        int temp = a;           // 保存原始数值用于最终比较
        int num = 0;            // 存储反转后的数值

        // 数字反转算法
        while (a != 0) {
            int ge = a % 10;    // 取最后一位数字
            a = a / 10;         // 移除最后一位数字
            num = num * 10 + ge; // 构建反转数字
        }

        // 通过比较原始数值和反转数值判断回文数
        System.out.println(num == temp ? "是回文数" : "不是回文数");
	}
}
