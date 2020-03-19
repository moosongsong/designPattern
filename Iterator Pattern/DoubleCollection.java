package 이터레이터연습;

public class DoubleCollection extends Collection{
	private Node head;
	private int count;
	
	public DoubleCollection() {//솔직히 이경우에는 생성자 필요없쪙
		//super();
		this.head = null;
		this.count = 0;
	}

	public void add(double data) {
		
		
		if(head == null) {
			head = new Node(data,null);
		}
		else {
			Node temp = head;
			
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(new Node(data, null));
		}
	}
	
	public double get(Node node) {
		return node.getData();
	}
	
	public Node getHead() {
		return head;
	}
	
	public int getCount() {
		return count;
	}

	@Override
	public Iterator iterator() {
		return new DoubleIterator(this);
	}

}
