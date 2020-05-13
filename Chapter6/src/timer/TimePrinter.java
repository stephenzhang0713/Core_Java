package timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @Author: zhanghan
 * @Date: 2020/5/13 10:37
 * @Description:
 */
public class TimePrinter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("At the zone, the time is "
				+ Instant.ofEpochMilli(e.getWhen()));
		Toolkit.getDefaultToolkit().beep();
	}
}
