package MergeSort;

public class Main {

	public static void main(String[] args) {
		int[] vet = {8, 9, 3, 5, 1,4,8,9,4,3};
		
		

		MergeSort.Ordenar(vet);
			System.out.println();

			for(int cont=0; vet.length > cont; cont++) {
		       	 System.out.print(vet[cont]);
		       	 if(vet[cont] != vet[10 -1]) {
		       		 System.out.print(" - ");
		       	 }
		       	 
		       }
		      	 
		      

	}

}
