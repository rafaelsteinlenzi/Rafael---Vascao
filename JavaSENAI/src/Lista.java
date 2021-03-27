
public interface Lista<T>{

	public void add(T o);
	
	public void add(int a, T o);
	
	public T remove(int a);
	
	public boolean removeFirst(T o);
	
	public T get(int a);
	
	public void clear();
	
	public T set(int a, T o);
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean contains(T o);
	
	public int indexOf(T o);
	
	public int lastIndexOf(T o);
	
	public T[] toArray();
}
