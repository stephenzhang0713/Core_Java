package pair2;

import java.time.LocalDate;

/**
 * @Author: zhanghan
 * @Date: 2020/5/19 11:35
 * @Description:
 */
public class Interval extends Pair<LocalDate> {

	@Override
	public void setSecond(LocalDate second) {
		if (second.compareTo(getFirst())>=0){
			super.setSecond(second);
		}

	}
}
