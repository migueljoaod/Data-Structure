
public class ArrayStack<E> implements Stack<E>{

	private E[] array;
	
	public ArrayStack(){
		array = (E[]) new Object[20];
	}
	
	public ArrayStack(int size){
		array = (E[]) new Object[size];
	}
	
	private int position = 0;

	@Override
	public void push(E e) {
		if (position >= array.length) {
			DoubleArray();
		}
		
		array[position] = e;
		position++;
	}

	@Override
	public E top() {
		if (isEmpty()) {
			return null;
		} else {
			return array[position - 1];
		}		
	}

	@Override
	public E pop() {
		
		if(isEmpty()){
			return null;
		}else{
			E temp = array[position - 1];
			array[position - 1] = null;
			position--;
			return temp;
		}
	}

	@Override
	public int getSize() {
		return position;
	}

	@Override
	public boolean isEmpty() {
		return position == 0;
	}
	
	public void DoubleArray(){
		E[] doubleArray = (E[]) new Object[array.length*2];
		System.arraycopy(array, 0, doubleArray, 0, array.length);
		array = doubleArray; 
	}
	
}
