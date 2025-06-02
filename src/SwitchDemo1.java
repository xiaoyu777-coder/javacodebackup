import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("想吃啥？");
        String noodles = sc.nextLine();
        switch (noodles) {
            case "兰州拉面", "热干面", "炸酱面", "油泼面" -> System.out.println("妈给你做！");
            default -> System.out.println("自己吃吧！");
        }
    }
}
