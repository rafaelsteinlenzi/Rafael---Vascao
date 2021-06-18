package BubbleSort;

public class BubbleSort {

	public static void Ordenar(Integer Array[]) {

		int var = Array.length;
		int aux = 0;
		int i = 0;
		
		
		for(i = 0; i<var; i++){
			for(int j = 0; j<var-1; j++){
				if(Array[j] > Array[j + 1]){
					aux = Array[j];
					Array[j] = Array[j+1];
					Array[j+1] = aux;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
