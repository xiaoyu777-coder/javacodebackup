public class DataBase {
    public static void main(String[] args) {
        //int最高支持2147483647
        int a = 2147483647;
        System.out.println(a);

        //long最高支持9223372036854775807,后面加L
        long b = 9223372036854775807L;
        System.out.println(b);

        //float最高支持3.4028235E38,后面加F
        float c = 3.4028235E38F;
        System.out.println(c);

        //double最高支持1.7976931348623157E308
        double d = 1.7976931348623157E308;
        System.out.println(d);

        //char最高支持\uFFFF（65535）
        char e = '\uFFFF';
        System.out.println(e);

        //short最高支持32767
        short f = 32767;
        System.out.println(f);

        //byte最高支持127
        byte g = 127;
        System.out.println(g);

        //boolean最高支持true和false
        boolean h = true;
        System.out.println(h);

        //String最高支持无数个“字符”
        String i = "Hello World";
        System.out.println(i);
    }
}
