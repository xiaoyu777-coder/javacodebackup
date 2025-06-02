import java.util.Scanner;

/**
 * 求平方根测试类
 * 通过线性查找算法计算整数平方根
 */
public class QiuPingFangGengTest1 {
    /**
     * 主方法 - 程序入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建Scanner对象用于接收用户输入
        Scanner sc = new Scanner(System.in);
        // 读取用户输入的整数
        System.out.println("请输入一个整数");
        int x = sc.nextInt();

        // 校验输入有效性
        if (x >= 2) {
            // 线性查找平方根：从1开始逐个尝试
            for (int i = 1; i <= x; i++) {
                // 找到完全平方的情况
                if (i * i == x) {
                    System.out.println(i + "就是" + x + "的平方根");
                    return; // 结束程序
                }
                // 超过目标值的情况，返回前一个整数
                else if (i * i > x) {
                    System.out.println((i - 1) + "就是" + x + "的整数平方根");
                    return; // 结束程序
                }
            }
        } else {
            // 输入不合法时的提示
            System.out.println("请输入大于等于2的整数");
        }
    }
}
