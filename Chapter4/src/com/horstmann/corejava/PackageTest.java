package com.horstmann.corejava;
import static java.lang.System.*;
/**
 * @Author: zhanghan
 * @Date: 2020/5/2 16:10
 * @Description:
 */
public class PackageTest {

	public static void main(String[] args) {
		var harry = new Employee("Harry hacker",50000,1989,10,1);

		harry.raiseSalary(5);

		out.println("name = "+harry.getName()+",salary="+harry.getSalary());


	}
}
