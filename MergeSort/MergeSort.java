package MergeSort;


public class MergeSort {

	public static int[] Ordenar(int[] vet) {
		merge(vet, 0, vet.length - 1);
		return vet;
	}

	private static void merge(int[] vet, int start, int end) {

		int middle;
		if (start < end) {
			middle = (start + end) / 2;
			merge(vet, start, middle);
			merge(vet, middle + 1, end);
			intercala(vet, start, middle, end);
		}

	}

	private static void intercala(int[] vet, int start, int middle, int end) {

		int temp[] = new int[vet.length];
		int inicioEsquerda = start; // primeiro indice do lado esquedo da divicao
		int inicioDireita = middle + 1; // primeiro indice do lado direito da divicao
		int posLivre = start;

		while (inicioEsquerda <= middle && inicioDireita <= end) {
			if (vet[inicioEsquerda] <= vet[inicioDireita]) {
				temp[posLivre] = vet[inicioEsquerda];
				inicioEsquerda = inicioEsquerda + 1;
			} else {
				temp[posLivre] = vet[inicioDireita];
				inicioDireita = inicioDireita + 1;
			}
			posLivre = posLivre + 1;
		}

		// se ainda houver numeros no primeira metado vetor
		// que não foram intercalados
		for (int i = inicioEsquerda; i <= middle; i++) {
			temp[posLivre] = vet[i];
			posLivre = posLivre + 1;
		}

		// se ainda houver numeros no segunda metado vetor
		// que não foram intercalados
		for (int i = inicioDireita; i <= end; i++) {
			temp[posLivre] = vet[i];
			posLivre = posLivre + 1;
		}
		
		//retorna os valores do vetor temporario ao vetor principal
		for (int i = start; i <= end; i++) {
			vet[i] = temp[i];
		}

	}

}
