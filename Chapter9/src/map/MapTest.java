package map;

import java.util.HashMap;

/**
 * @Author: zhanghan
 * @Date: 2020/6/2 18:13
 * @Description:
 */
public class MapTest {

	public static void main(String[] args) {
		var staff = new HashMap<String, Employee>();
		staff.put("144-25-5464",new Employee("Amy Lee"));
		staff.put("567-24-2546",new Employee("Harry Hacker"));
		staff.put("157-62-7935",new Employee("Gary Cooper"));
		staff.put("456-62-5527",new Employee("Francesca Cruz"));

		//  print all entries
		System.out.println(staff);

		//  remove an entry
		staff.remove("567-24-2546");

		//  replace an entry
		staff.put("456-62-5527",new Employee("Francesca Miller"));

		// look up a value
		System.out.println(staff.get("157-62-7935"));

		// iterate through all entries
		staff.forEach((k,v)-> System.out.println("key="+k+", value="+v));



	}
}
