import java.util.Random;


public class ShuZu10 {
    public static void main(String[] args) {
        //0 1 2 3 4
        int[] arr = {1,2,3,4,5};
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int RandomIndex = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[RandomIndex];
            arr[RandomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
