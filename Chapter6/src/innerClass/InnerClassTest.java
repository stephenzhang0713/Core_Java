package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * @Author: zhanghan
 * @Date: 2020/5/14 18:14
 * @Description:
 */
public class InnerClassTest {

	public static void main(String[] args) {

//		var clock = new TalkingClock(1000, true);

		// keep program running until the user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);

	}
}

/**
 * A clock that prints the time in regular intervals
 */
class TalkingClock {

	public TalkingClock() {

	}

	public void start(int interval, boolean beep) {

		class TimePrinter implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("At the zone, the time is "
						+ Instant.ofEpochMilli(event.getWhen()));
				if (beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}

		}

		var listener = new TimePrinter();
		var timer = new Timer(interval, listener);
		timer.start();
	}


}
