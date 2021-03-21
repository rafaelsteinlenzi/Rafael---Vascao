import java.util.ArrayList;

public class ListaComArray {

	private Integer array[];
	private boolean resizable;
	private int initialCapacity;
	private int counter;
	private static int X = 7;
	
	public ListaComArray() {
		this(10);
	}
	
	public ListaComArray(int initialCapacity) {
		this(initialCapacity, true);
	}
	
	public ListaComArray(int initialCapacity, boolean resizable) {
		this.initialCapacity = initialCapacity;
		this.resizable = resizable;
		this.counter = 0;
		this.array = new Integer[initialCapacity];
	}
	
	public void add(Integer obj) {
		array[counter] = obj;
		counter++;
		
		if(resizable && counter == array.length) {
			resizeArrayList();
		}
			
	}
	
	public void add(int counter, Integer b) {
		
	}
	
	private void resizeArrayList() {
		
	}
	
	public Integer remove(int counter) {
		return counter;
	}
	
	public int size(int counter) {
		return counter;
	}
	
	public Integer[] toArray() {
		return array;
	}
	
	public boolean isEmpty() {	
		return counter == 0;
	}
	
	public boolean isFull() {
		return counter == array.length;
	}
	
	
}
