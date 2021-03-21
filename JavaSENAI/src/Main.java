
public class Main {

	public static void main(String[] args) {
		
		ListaComArray lista = new ListaComArray();
		lista.add(6);
		lista.add(11);
		lista.add(15);
		
		Integer[] array = lista.toArray();
		
		for (int i = 0; i < lista.toArray().length; i++) {
			System.out.println(array[i]);
		}
	}

}
