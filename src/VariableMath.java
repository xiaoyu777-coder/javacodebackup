public class VariableMath {
    public static void main(String[] args) {
        //一开始没乘客
        int nfp = 0;
        //乘客上车1人
        //在基础上增加1人
        nfp = nfp + 1;
        System.out.println(nfp + " people");

        //乘客上车2人，下来1人
        nfp = nfp + 2 - 1;
        System.out.println(nfp + " people");

        //乘客上车2人，下来1人
        nfp = nfp + 2 - 1;
        System.out.println(nfp + " people");

        //下去一位乘客
        nfp = nfp - 1;
        System.out.println(nfp + " people");

        //上去一位乘客
        nfp = nfp + 1;
        System.out.println(nfp + " people");

    }
}
