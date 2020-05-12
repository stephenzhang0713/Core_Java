package methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: zhanghan
 * @Date: 2020/5/12 17:44
 * @Description:
 */
public class MethodTableTest {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		Method square = MethodTableTest.class.getMethod("square", double.class);
		Method sqrt = Math.class.getMethod("sqrt", double.class);

		printTable(1,10,10,square);
		printTable(1,10,10,sqrt);

	}


	public static double square(double x) {
		return x * x;
	}

	public static void printTable(double from, double to, int n, Method f) throws InvocationTargetException, IllegalAccessException {
		System.out.println(f);

		double dx = (to - from) / (n - 1);
		for (double x = from; x <= to; x += dx) {
			double y = (Double) f.invoke(null, x);
			System.out.printf("%10.4f | %10.4f%n",x,y);
		}
	}
}
