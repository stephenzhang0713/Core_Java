package abstractClasses;

/**
 * @Author: zhanghan
 * @Date: 2020/5/7 21:51
 * @Description:
 */
public class Student extends Person {

	private final String major;

	public Student(String name, String major) {
		super(name);
		this.major = major;
	}


	@Override
	public String getDescription() {
		return "a student majoring in "+major;
	}
}
