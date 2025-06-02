public class ShuZu5 {
    public static void main(String[] args) {
        // 创建一个长度为3的整数数组，动态初始化数组元素为0
        int[] arr = new int[3];
        // 为数组的第一个元素赋值为1
        arr[0] = 1;
        // 为数组的第二个元素赋值为2
        arr[1] = 2;
        // 遍历数组并打印每个元素的值
        for (int i : arr) {
           System.out.println(arr[i]);
        }
    }
}

