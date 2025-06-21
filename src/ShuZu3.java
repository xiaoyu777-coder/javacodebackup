public class ShuZu3 {
    public static void main(String[] args) {
        // 定义一个整数数组，包含元素1到10
        int[] arr = {1, 2, 3, 4, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("有" + count + "个元素能被3整除");
    }
}