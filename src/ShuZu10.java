import java.util.Random;


public class ShuZu10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // 初始化一个包含5个整数的数组
        Random rand = new Random(); // 创建随机数生成器对象
        for (int i = 0; i < arr.length; i++) {
            int RandomIndex = rand.nextInt(arr.length); // 生成一个0到数组长度-1之间的随机索引
            int temp = arr[i]; // 交换当前元素和随机索引位置的元素
            arr[i] = arr[RandomIndex];
            arr[RandomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 输出数组中每个元素的值
        }
    }
}
