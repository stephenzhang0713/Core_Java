package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 * @Author: zhanghan
 * @Date: 2020/5/14 11:37
 * @Description:
 */
public class LambdaTest {

	public static void main(String[] args) {

		var planets = new String[]{"Mercury", "Venus", "Earth", "Mars",
				"Jupiter", "Saturn", "Uranus", "Neptune"};

		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted in dictionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));
		System.out.println("Sorted by length:");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(planets));


		repeat(10, i -> System.out.println("Countdown:" + (9 - i)));


		//  keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++) {
			action.accept(i);
		}
	}
}
