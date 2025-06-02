public class ArithmeticoperatorDemo3 {


    public static void main(String[] args) {
        int a = 10;
        //小转大ok，大转小需要强制转换格式，byte<short<char<int<long<float<double
        //byte short char 在计算过程中，会先提升为int，再计算
        //大转小需要强制转换格式为：（要转换的数据类型）变量名 = （要转换的数据类型）数据值
        double b = 20.0;
        double c = a + b;
        System.out.println(c);
    }
}
