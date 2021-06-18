package QuickSort;

public class QuickSort {
    private static int start;
    private static int Final;

    public static Integer[] Organizar(Integer vet[]){
    	start = 0;
    	Final = vet.length - 1;
    	findAtacante(vet, start, Final);
        return vet;
    }
    private static void findAtacante(Integer vet[], int start, int Final){
        if(start >= Final){
            return;
        }
        int Running = start + 1;
        int Atacante = start;
        do{
            if(Atacante < Final && vet[Atacante] > vet[Running]){
                int pivo2 = vet[Atacante];
                vet[Atacante] = vet[Running];
                for (int i = Running; i > Atacante; i--){
                	vet[i] = vet[i-1];
                }
                Atacante++;
                vet[Atacante] = pivo2;
            }
            Running++;

        }while(Running <= Final);
        findAtacante(vet, Atacante + 1, Final);
        findAtacante(vet, 0, Atacante - 1);
    }
}

