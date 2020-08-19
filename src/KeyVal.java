public class KeyVal implements Comparable {
	private long key;// stores a long value read from in.csv
	private int val;// stores the index of the row where key comes from

	public KeyVal(long aKey, int aVal) {
		key = aKey;
		val = aVal;
	}

	public int compareTo(Object o) {
		return (key < ((KeyVal) o).key) ? -1 : (key > ((KeyVal) o).key) ? 1 : 0;
	}

	public long getKey() {
		return key;
	}

	public int getValue() {
		return val;
	}
	
	
}