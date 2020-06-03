package ibatis.util;

import java.util.HashMap;

/**
 * @Author: zhanghan
 * @Date: 2020/6/3 17:28
 * @Description:
 */
public class ParameterMap extends HashMap<Object, Object> {
	private static final long serialVersionUID = 1L;

	public ParameterMap(Object... parameters) {
		for (int i = 0; i < parameters.length - 1; i += 2) {
			super.put(parameters[i], parameters[i + 1]);
		}
	}
}
