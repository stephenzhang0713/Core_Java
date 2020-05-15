package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author: zhanghan
 * @Date: 2020/5/15 14:37
 * @Description:
 */
public class ProxyTest {

	public static void main(String[] args) {

		var elements = new Object[1000];

		//  fill elements with proxies for the integers 1...1000
		for (int i = 0; i < elements.length; i++) {
			Integer value = i + 1;
			var handler = new TraceHandler(value);
			Object proxy = Proxy.newProxyInstance(
					ClassLoader.getSystemClassLoader(),
					new Class[]{Comparable.class}, handler);
			elements[i] = proxy;
		}

		//  construct a random Integer
		Integer key = new Random().nextInt(elements.length) + 1;

		//  Search for the key
		int result = Arrays.binarySearch(elements, key);

		//  print match if found
		if (result >= 0) {
			System.out.println(elements[result]);
		}

	}
}

/**
 * An invocation handler that prints out the method name and parameters,then
 * invokes the original method
 */
class TraceHandler implements InvocationHandler {

	private Object target;

	public TraceHandler(Object target) {
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		//  print implicit argument
		System.out.print(target);

		//  print method name
		System.out.print("." + method.getName() + "(");

		//  print explicit arguments
		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
				if (i < args.length - 1) {
					System.out.print(",");
				}
			}
		}
		System.out.println(")");

		//  invoke actual method
		return method.invoke(target, args);
	}
}
