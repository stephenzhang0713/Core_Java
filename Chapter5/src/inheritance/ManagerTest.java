package inheritance;

/**
 * @Author: zhanghan
 * @Date: 2020/5/7 13:57
 * @Description:
 */
public class ManagerTest {

	public static void main(String[] args) {

		var boss = new Manager("Carl Cracker",80000,1987,12,15);
		boss.setBonus(5000);

		var staff = new Employee[3];

		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
		staff[2] = new Employee("Tom Tester",40000,1990,10,3);

		for (Employee e : staff) {
			System.out.println(e.getName()+" "+e.getSalary());
		}
	}
}
