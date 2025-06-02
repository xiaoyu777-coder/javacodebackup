public class ShuZu4 {
    public static void main(String[] args) {
        // 初始化一个整数数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 遍历数组，对每个元素进行判断和操作
        for (int i = 0; i < arr.length; i++) {
            // 如果元素是偶数，则将其除以2
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else {
                // 如果元素是奇数，则将其乘以2
                arr[i] = arr[i] * 2;
            }
        }
        // 再次遍历数组，打印每个元素的值
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}