public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(10 + 20);//30
        // -
        System.out.println(10 - 20);//-10
        // *
        System.out.println(10 * 20);//200
        // /
        System.out.println(10 / 2);//5
        // %(余数符)
        System.out.println(10 % 3);//1

        //小数在计算时，可能会得到不精确的结果
        //如果对结果有要求，那么可以使用BigDecimal类
        System.out.println(10.0 / 3);//3.3333333333333335
    }
}
