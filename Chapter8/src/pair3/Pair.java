package pair3;

/**
 * @Author: zhanghan
 * @Date: 2020/5/18 21:23
 * @Description:
 */
public class Pair<T> {

	private T first;
	private T second;

	public Pair() {
		first=null;
		second=null;
	}

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}

}
