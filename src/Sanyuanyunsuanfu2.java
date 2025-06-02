import java.util.Scanner;  // 导入Scanner类用于控制台输入

public class Sanyuanyunsuanfu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 创建Scanner对象
        int high1 = sc.nextInt();  // 读取第一个身高值
        int high2 = sc.nextInt();  // 读取第二个身高值
        int high3 = sc.nextInt();  // 读取第三个身高值

        if (high1 > high2 && high1 > high3) {
            System.out.println(high1);  // 输出最大身高值
        }
        else if (high2 > high1 && high2 > high3) {
            System.out.println(high2);
        }
        else if (high3 > high1 && high3 > high2)
            System.out.println(high3);


    }
}
