import java.util.Random;

public class ShuZu8 {
    public static void main(String[] args) {
        //定义随机数
        Random rand = new Random();
        //动态变量
        int[] arr1 = new int[10];
        //随机数遍历加入数组
        for(int i = 0 ; i < arr1.length ; i++){
            int number = rand.nextInt(100) + 1;
            arr1[i] = number;
        }
        //数组求和
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("和为：" + sum);
        int avg, sum2 = 0;
        int max =arr1.length;
        for (int i = 0; i < arr1.length; i++) {
            sum2 += arr1[i];
        }
        avg = sum2 / max;
        System.out.println("平均值为：" + avg);
    }
}
