package lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @Author: zhanghan
 * @Date: 2020/5/14 16:05
 * @Description:
 */
public class RepeatedGreeter extends Greeter {

	@Override
	public void greet(ActionEvent event){
		var timer =new Timer(1000,super::greet);
		timer.start();
	}
}
