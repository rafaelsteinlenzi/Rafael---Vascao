


public class ListaComEncadeamento <T> implements Lista <T>{
	private NoLista first;
	private NoLista last;
	private int counter;
	
	public ListaComEncadeamento() {
		
		this.first = null;
		this.last  = null;
		this.counter = 0;
	}
	

	@Override
	public void add(T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int a, T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int a) {
	
	}

	@Override
	public boolean removeFirst(T o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int a, T o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void clear() {
		 for (int i = 0; i < size; i++)
		        elementData[i] = null;
		 
		    size = 0;
		
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
