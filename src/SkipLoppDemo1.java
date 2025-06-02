public class SkipLoppDemo1 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i > 5) {
                break;
            }
            System.out.println("小老虎在吃第"+ i +"个包子");
        }
    }
}
