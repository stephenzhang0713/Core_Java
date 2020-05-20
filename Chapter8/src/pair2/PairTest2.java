package pair2;

import java.time.LocalDate;
import java.util.function.IntFunction;

/**
 * @Author: zhanghan
 * @Date: 2020/5/18 21:42
 * @Description:
 */
public class PairTest2 {

	public static void main(String[] args) {

		LocalDate[] birthdays = {
				LocalDate.of(1996, 12, 9),
				LocalDate.of(1815, 12, 19),
				LocalDate.of(1903, 12, 3),
				LocalDate.of(1910, 6, 22),
		};
//		Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
//		System.out.println("min = " + mm.getFirst());
//		System.out.println("max= " + mm.getSecond());

		String[] names = ArrayAlg.minmax(String[]::new, "Tom", "Dick", "Harry");

	}

}

class ArrayAlg {

	public static <T extends Comparable> T[] minmax(IntFunction<T[]> constr, T... a) {

		T[] result = constr.apply(2);
		if (a == null || a.length == 0) {
			return null;
		}
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0) {
				min = a[i];
			}
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		return (T[]) result;
	}



}
