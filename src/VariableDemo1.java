public class VariableDemo1 {

	public static void main(String[] args) {
		//变量名不能重复
		//变量名只能是数字、字母、下划线、$
		int a = 5;
		System.out.println(a);//5

		//计算变量
		int b = 10;
		System.out.println(a + b);//15

		//分割线
		System.out.println("-----------------qwq----------------");

		//变量可以修改值
		a = 10;
		System.out.println(a + b);//20

		//test
		int c = 10, d = 20, e = 30, f = 40, g = 50, h = 60;
		System.out.println(a + b + c + d + e + f + g + h + h);//260

		//不要把数值分割开写(不建议)
		int i;
		i = 10;
		System.out.println(i);
	}
}
