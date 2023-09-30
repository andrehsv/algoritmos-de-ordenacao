public class Main {
    public static void main(String[] args) {
        int[] a = {2,5,7,8,1,3};
        InsertionSort.insertionSort(a);
        printArray(a);
        
    }

    static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;
        for(; i < array.length-1; i++)
            System.out.print(array[i] + ",");
        System.out.println(array[i] + "]\n");
    }
}
