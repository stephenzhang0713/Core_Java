package interfaces;

/**
 * @Author: zhanghan
 * @Date: 2020/5/12 18:55
 * @Description:
 */
public class Emplotyee implements Comparable<Emplotyee> {

	private String name;
	private double salary;

	public Emplotyee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public int compareTo(Emplotyee other) {
		return Double.compare(salary,other.salary);
	}
}
