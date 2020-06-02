package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @Author: zhanghan
 * @Date: 2020/6/2 15:52
 * @Description:
 */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<>();
		a.add("Amy");
		a.add("Carl");
		a.add("Erica");

		LinkedList<String> b = new LinkedList<>();
		b.add("Bob");
		b.add("Doug");
		b.add("Frances");
		b.add("Gloria");

		// merge the words from b to a

		ListIterator<String> aIter = a.listIterator();
		Iterator<String> bIter = b.iterator();

		while (bIter.hasNext()) {
			if (aIter.hasNext()) {
				aIter.next();
			}
			aIter.add(bIter.next());
		}

		System.out.println(a);

		//  remove every second word from b
		bIter = b.iterator();
		while (bIter.hasNext()) {
			bIter.next();   //skip one element
			bIter.remove(); //remove that element
		}

		System.out.println(b);

		// bulk operation:remove all words in b from a
		a.removeAll(b);
		System.out.println(a);
	}
}
