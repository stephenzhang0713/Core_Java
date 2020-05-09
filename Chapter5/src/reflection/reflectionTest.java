package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @Author: zhanghan
 * @Date: 2020/5/9 10:55
 * @Description:
 */
public class reflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {

		//  read class name from command line args or user input
		String name;
		if (args.length > 0) {
			name = args[0];
		} else {
			var in = new Scanner(System.in);
			System.out.println("Enter class name (e.g. java.util.Date): ");
			name = in.next();
		}

		//  print class name and superclass name (if != object)
		Class<?> cl = Class.forName(name);
		Class<?> superclass = cl.getSuperclass();
		String modifiers = Modifier.toString(cl.getModifiers());
		if (modifiers.length() > 0) {
			System.out.print(modifiers + " ");
		}
		System.out.print("class " + name);
		if (superclass != null && superclass != Object.class) {
			System.out.print(" extends " + superclass.getName());
		}
		System.out.print("\n{\n");
		printConstructors(cl);
		System.out.println();
		printMethods(cl);
		System.out.println();
		printFields(cl);
		System.out.println("}");


	}

	/**
	 * print all constructors of a class
	 *
	 * @param cl a class
	 * @return
	 * @throws ManagerException
	 * @author zhanghan
	 * @createTime 2020-05-09 15:12:48
	 **/

	public static void printConstructors(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors();
		for (Constructor c : constructors) {
			String name = c.getName();
			System.out.print(" ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + "  ");
			}
			System.out.print(name + "(");

			//  print parameter types
			Class[] parameterTypes = c.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				if (j > 0) {
					System.out.print(", ");
				}
				System.out.print(parameterTypes[j].getName());
			}
			System.out.println(");");
		}
	}

	/**
	 * @param null
	 * @return
	 * @throws ManagerException
	 * @author zhanghan
	 * @createTime 2020-05-09 15:14:48
	 **/

	public static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();

		for (Method m : methods) {
			Class<?> returnType = m.getReturnType();
			String name = m.getName();

			System.out.print(" ");
			// print modifiers, return types and method name
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.print(returnType.getName() + " " + name + "(");

			// print parameter types
			Class<?>[] parameterTypes = m.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				if (j > 0) {
					System.out.print(",");
				}
				System.out.println(");");
			}
		}
	}


	/**
	 * @param null
	 * @return
	 * @throws ManagerException
	 * @author zhanghan
	 * @createTime 2020-05-09 15:24:00
	 **/

	public static void printFields(Class cl) {
		Field[] fields = cl.getDeclaredFields();

		for (Field f : fields) {
			Class<?> type = f.getType();
			String name = f.getName();
			System.out.print(" ");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0) {
				System.out.print(modifiers + " ");
			}
			System.out.println(type.getName() + " " + name + ";");

		}
	}
}
