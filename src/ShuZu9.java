public class ShuZu9 {
    public static void main(String[] args) {
        //完蛋我听不懂！！！

        // 定义一个整型数组arr，包含元素1,2,3,4,5
        int[] arr = {1,2,3,4,5};

        // 使用双指针i和j，i从数组头开始，j从数组尾开始，向中间移动
        // 目的是交换数组两端的元素，实现数组反转
        for(int i = 0,j = arr.length - 1 ; i < j ; i++,j--) {
            int temp = arr[i];  // 暂存左边元素
            arr[j] = temp;      // 将左边元素赋值给右边元素（这里有错误，应该交换）
        }

        // 遍历数组，打印每个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
