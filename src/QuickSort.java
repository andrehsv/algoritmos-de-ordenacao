public class QuickSort {
    public static void quickSort(int[] A, int p, int r) {
        if(p < r) {
            int q = particione(A, p, r);
            quickSort(A,p,q-1);
            quickSort(A,q+1, r);
        }
    }

    private static int particione(int[] A, int p, int r) {
        int pivo = A[r];
        int i = p-1;
        for(int j = p;j < r-1; j++) {
            if(A[j] <= pivo) {
                i = i+1;
                int temp1 = A[i];
                A[i] = A[r];
                A[r] = temp1;
            }
        }
        int temp2 = A[r];
        A[r] = A[i+1];
        A[i+1] = temp2;
        return i+1;

    }
}
