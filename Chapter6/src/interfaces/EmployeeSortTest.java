package interfaces;

import java.util.Arrays;

/**
 * @Author: zhanghan
 * @Date: 2020/5/12 18:54
 * @Description:
 */
public class EmployeeSortTest {

	public static void main(String[] args) {

		var staff = new Emplotyee[3];

		staff[0]=new Emplotyee("Harry Hacker",35000);
		staff[1]=new Emplotyee("Carl Cracker",75000);
		staff[2]=new Emplotyee("Tony Tester",38000);

		Arrays.sort(staff);

		for (Emplotyee e : staff) {
			System.out.println("name= "+e.getName()+",salary="+e.getSalary());
		}
	}
}
