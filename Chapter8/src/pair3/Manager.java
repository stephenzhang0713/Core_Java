package pair3;

import java.util.StringJoiner;

/**
 * @Author: zhanghan
 * @Date: 2020/5/7 13:57
 * @Description:
 */
public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}

	@Override
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Manager)) return false;
		if (!super.equals(o)) return false;

		Manager manager = (Manager) o;

		return Double.compare(manager.bonus, bonus) == 0;
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bonus);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Manager.class.getSimpleName() + "[", "]")
				.add("bonus=" + bonus)
				.toString();
	}
}
