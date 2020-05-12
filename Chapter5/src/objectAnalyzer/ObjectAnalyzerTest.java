package objectAnalyzer;

import java.util.ArrayList;

/**
 * @Author: zhanghan
 * @Date: 2020/5/12 14:51
 * @Description:
 */
public class ObjectAnalyzerTest {

	public static void main(String[] args) throws ReflectiveOperationException {
		ArrayList<Integer> squares = new ArrayList<>();
		for (int i = 0; i <= 5; i++) {
			squares.add(i * i);
		}
		System.out.println(new ObjectAnalyzer().toString(squares));
	}
}
