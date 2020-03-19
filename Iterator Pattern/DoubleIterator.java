package 이터레이터연습;

public class DoubleIterator extends Iterator{
	
	private DoubleCollection collection;
	private Node cursor;
	
	public DoubleIterator(DoubleCollection collection) {
		this.collection=collection;
		this.cursor = collection.getHead();
//		System.out.println(collection.getHead());
	}
	
	@Override
	public boolean hasNext() {
		if(cursor!=null) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Node temp = cursor;
		cursor = cursor.getNext();
		return temp.getData();
	}

}
