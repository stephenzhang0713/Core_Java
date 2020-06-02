package treeSet;

import java.util.StringJoiner;

/**
 * @Author: zhanghan
 * @Date: 2020/6/2 17:16
 * @Description:
 */
public class Item implements Comparable<Item> {

	private String description;
	private int partNumber;


	/**
	 * constructs an item.
	 *
	 * @param aDescription the item's description
	 * @param aPartNumber  the item's part number
	 */
	public Item(String aDescription, int aPartNumber) {
		this.description = aDescription;
		this.partNumber = aPartNumber;
	}

	/**
	 * Gets the description of this item.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
				.add("description='" + description + "'")
				.add("partNumber=" + partNumber)
				.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Item)) return false;

		Item item = (Item) o;

		if (partNumber != item.partNumber) return false;
		return getDescription() != null ? getDescription().equals(item.getDescription()) : item.getDescription() == null;
	}

	@Override
	public int hashCode() {
		int result = getDescription() != null ? getDescription().hashCode() : 0;
		result = 31 * result + partNumber;
		return result;
	}

	@Override
	public int compareTo(Item o) {
		int diff = Integer.compare(partNumber, o.partNumber);
		return diff != 0 ? diff : description.compareTo(o.description);
	}
}
