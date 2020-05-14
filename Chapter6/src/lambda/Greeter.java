package lambda;

import java.awt.event.ActionEvent;
import java.time.Instant;

/**
 * @Author: zhanghan
 * @Date: 2020/5/14 16:04
 * @Description:
 */
public class Greeter {

	public void greet(ActionEvent event) {
		System.out.println("Hello,the time is "
				+ Instant.ofEpochMilli(event.getWhen()));
	}



}
