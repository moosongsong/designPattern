package src;

//import Iterator.Iterator;

public class IntegerCollection {
	private Integer[] base;//주둔지
//	private int cursor;
	private int count;
	
	public IntegerCollection(int size) {
		base = new Integer[size];
		count=0;
	}
//
//	public void setBase(int[] base) {
//		this.base = base;
//	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
//	public int[] getBase() {
//		return base;
//	}

	public int getCount() {
		return count;
	}

	public void add(int value) {
		if(count<base.length) {
			base[count++]=value;
		}
	}
	
	public int getAt(int idx) {
		if (idx<count) {
			return base[idx];
		}
		return -1;
	}
	
	public Iterator iterator() {
		return new IntegerIterator(this);
	}
}
