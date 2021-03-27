import java.util.ArrayList;

public class ListaComArray <T> implements Lista<T>{

	private T array[];
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
		this.array =  (T[]) new Object[initialCapacity];
	}
	
	
	public void resizeArrayList() {
		T[] novaLista = (T[]) new Object[this.array.length + X];
        for (int i = 0; i < this.array.length; i++)
            novaLista[i] = this.array[i];
        this.array = novaLista;
	}
	
	public boolean isFull() {
		return counter == array.length;
	}

	@Override
	public void add(T o) {
		this.array[counter] = o;
		counter++;
		
		if(resizable && counter == array.length) {
			resizeArrayList();
		}
		
	}

	@Override
	public void add(int a, T o) {
		this.array[a] = o;		
	}

	@Override
	public boolean removeFirst(T elemento) {
		
		for (int i = 0; i < counter; i++) {
			if (this.array[i] == elemento) {
				this.remove(i);
				return true;
			}
		}
		return false;
		
	}

	@Override
	public T get(int a) {
		// TODO Auto-generated method stub
		return this.array[a];
	}

	@Override
	public void clear() {
		 for (int i = 0; i < counter; i++)
		        array[i] = null;
		 
		    counter = 0;
		
	}

	@Override
	public T set(int a, T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return counter;
	}

	@Override
	public boolean contains(T o) {
		
		for (int i = 0; i < counter; i++) {
			if(array[i] == o) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int indexOf(T o) {
		for (int i = 0; i < array.length; i++) {
			array[i] = o;
			return i;
		}
		return -1;
	}

	@Override
	public int lastIndexOf(T o) {
		
		return 0;
	}

	@Override
	public T remove(int index) {
		
		for (int i = index; i < counter; i++) {
			this.array[i] = this.array[i + 1]; 
		}
		
		return this.array[index];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
