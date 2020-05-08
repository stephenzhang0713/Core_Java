package abstractClasses;

/**
 * @Author: zhanghan
 * @Date: 2020/5/7 21:47
 * @Description:
 */
public abstract class Person {

	private final String name;

	public Person(String name) {
		this.name = name;
	}

	public abstract String getDescription();

	public String getName() {
		return name;
	}
}
