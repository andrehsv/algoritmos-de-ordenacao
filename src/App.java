public class App {
    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};
        printArray(arr);
        QuickSort.quickSort(arr, 0, arr.length-1);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for(int i = 0; i < array.length; i++) {
            if(i == (array.length - 1))
                System.out.print(array[i] + "]\n");
            else
                System.out.print(array[i] + ",");
        }
    }
}
