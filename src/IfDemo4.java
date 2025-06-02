import java.util.Scanner;

// 成绩评级演示类
public class IfDemo4 {
    // 主程序入口
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score: ");
        int a = sc.nextInt();

        // 验证输入有效性（0-100分）
        if (a > 0 && a <= 100) {
            // 分级判断逻辑
            if (a >= 95 && a <= 100) {  // 优秀段
                System.out.println("Excellent!");
            }else if (a >= 90 && a <= 94) {  // 良好段
                System.out.println("Good!");
            }else if (a >= 80 && a <= 89) {  // 中等段
                System.out.println("Average!");
            }
            else if (a >= 60 && a <= 79) {  // 及格段
                System.out.println("Pass!");
            }
        }else {  // 无效输入处理
            System.out.println("Error!");
        }
	}
}





