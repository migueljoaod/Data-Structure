package estd;

public class SLinkedList<T>{
	private Node<T> first;
	
	private Node<T> last;
	
	public Node<T> getFirst() {
		return first;
	}

	public Node<T> getLast() {
		return last;
	}



	private long size = 0;
	
	public void removeFirst(){
		if(!isEmpty()){
			
			first = first.getNext();
			size--;
			if (isEmpty()) {
				last = first;
			}
			
		}
	}
	
	public long getSize(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	
	
	public void add(Node<T> node){
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.setNext (node);
			last = node;
			
		}
	size++;	
	}
	
	
}
