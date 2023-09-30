public class InsertionSort {
    public static void insertionSort(int[] A) {
        for(int j = 2; j < A.length; ++j) {
            int chave = A[j];
            int i = j-1;
            while(i > 0 && A[i] > chave) {
                A[i+1] = A[i];
                i = i-1;
            }
            A[i+1] = chave;
        }
    }
}
