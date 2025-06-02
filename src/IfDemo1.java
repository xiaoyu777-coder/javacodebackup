import java.util.Scanner;  // 导入输入处理类

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 创建控制台输入对象
        System.out.println("请输入酒量：");     // 显示输入提示
        int a = sc.nextInt();                // 读取用户输入的整数值

        // 通过if-else结构进行条件判断
        if (a > 10) {
            System.out.println("小伙计酒量不错！！");  // 酒量大于10时的输出
        } else {
            System.out.println("小伙计酒量一般！！");  // 酒量小于等于10时的输出
        }
    }
}
