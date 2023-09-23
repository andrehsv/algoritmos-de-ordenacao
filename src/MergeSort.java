public class MergeSort {
    public static void mergeSort(int[] array, int n) {
        if(n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for(int i = 0; i < mid; i++) {
            l[i] = array[i];
        }

        for(int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    private static void merge(int[] array, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right) {
            if(l[i] <= r[j]) {
                array[k++] = l[i++];
            }
            else {
                array[k++] = r[j++];
            }
        }
        while(i < left) {
            array[k++] = l[i++];
        }
        while(j < right) {
            array[k++] = r[j++];
        }
    }
}
