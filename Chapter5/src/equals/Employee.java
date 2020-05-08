package equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author: zhanghan
 * @Date: 2020/5/8 20:01
 * @Description:
 */
public class Employee {


	private final String name;
	private double salary;
	private final LocalDate hireDay;

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public boolean equals(Object otherObject) {
//		a quick test to see if the objects are identical
		if (this == otherObject)
			return true;

		if (otherObject == null)
			return false;

		if (getClass() != otherObject.getClass())
			return false;

		var other = (Employee) otherObject;
		return Objects.equals(name, other.name)
				&& salary == other.salary
				&& Objects.equals(hireDay, other.hireDay);

	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getSalary(), getHireDay());
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
