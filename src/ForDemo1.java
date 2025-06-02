public class ForDemo1 {
    public static void main(String[] args) {
        double sum = 0;
        //在你知道循环范围和循环次数的时候用
        for (int i = 1;i <= 999999999; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

    }
}