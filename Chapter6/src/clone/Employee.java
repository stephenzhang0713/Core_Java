package clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: zhanghan
 * @Date: 2020/5/13 17:00
 * @Description:
 */
public class Employee implements Cloneable {

	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		hireDay = new Date();
	}

	@Override
	public Employee clone() throws CloneNotSupportedException {
		// call Object.clone()
		Employee cloned = (Employee) super.clone();

		// clone mutable fields
		cloned.hireDay = (Date) this.hireDay.clone();

		return cloned;
	}

	public void setHireDay(int year, int month, int day) {
		Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

		//  example of instance field mutation
		hireDay.setTime(newHireDay.getTime());
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", salary=" + salary +
				", hireDay=" + hireDay +
				'}';
	}
}
