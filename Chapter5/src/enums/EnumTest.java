package enums;

import java.util.Scanner;

enum Size {

	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

	private String abbreviation;

	Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}
}

/**
 * @Author: zhanghan
 * @Date: 2020/5/9 10:20
 * @Description:
 */
public class EnumTest {

	public static void main(String[] args) {
		var in = new Scanner(System.in);
		System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("abbreviation= " + size.getAbbreviation());
		if (size == Size.EXTRA_LARGE) {
			System.out.println("Good job--you paid attention to the _.");
		}
	}

}

