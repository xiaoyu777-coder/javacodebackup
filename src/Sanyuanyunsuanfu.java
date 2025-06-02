import java.util.Scanner;  // 导入输入处理类

public class Sanyuanyunsuanfu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 创建控制台输入对象
        System.out.println("Enter top 1 tigger weight: ");  // 提示输入第一只老虎体重
        int top1 = sc.nextInt();              // 读取第一只老虎体重值
        System.out.println("Enter top 2 tigger weight: ");  // 提示输入第二只老虎体重
        int top2 = sc.nextInt();              // 读取第二只老虎体重值

        // 使用三元运算符比较两个体重值并输出结果
        System.out.println(top1 == top2 ? "体重相同" : "体重不相同");
    }
}
