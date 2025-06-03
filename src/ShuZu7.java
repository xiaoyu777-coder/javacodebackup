public class ShuZu7 {
    public static void main(String[] args) {
        // 定义一个整数数组
        int[] arr = {20, 22, 18, 35, 48, 26, 87, 70};
        // 获取数组的长度
        int max = arr.length;
        // 初始化平均值和总和变量
        int avg, sum = 0;
        // 遍历数组，计算总和
        for (int temp : arr) {
            sum += temp;
        }
        // 计算平均值
        avg = sum / max;
        // 输出平均值
        System.out.println("平均值为：" + avg);
    }
}
