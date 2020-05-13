package clone;

/**
 * @Author: zhanghan
 * @Date: 2020/5/13 17:12
 * @Description:
 */
public class cloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		var original = new Employee("John Q. Public", 50000);
		original.setHireDay(2000,1,1);
		Employee copy = original.clone();
		copy.raiseSalary(10);
		copy.setHireDay(2002,12,31);
		System.out.println("original="+original);
		System.out.println("copy="+copy);
	}
}
