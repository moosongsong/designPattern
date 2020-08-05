package src;

public class IntegerIterator extends Iterator{
	
	IntegerCollection collection;
	private int cursor;
	
	public IntegerIterator(IntegerCollection collection) {
		// TODO Auto-generated constructor stub
		this.collection=collection;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(cursor<collection.getCount()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return collection.getAt(cursor++);
	}
	
}
