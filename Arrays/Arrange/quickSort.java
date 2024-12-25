import java.util.Arrays;

public class quickSort {
    public static void quick_Sort(int[] arr, int low, int high) {
        if (low < high) {
            
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            quick_Sort(arr, low, pi - 1);
            quick_Sort(arr, pi + 1, high);
        }
    }
        private static int partition(int[] arr, int low, int high) {
            int pivot = arr[high]; // Choose the last element as the pivot
            int i = low - 1; // Index of the smaller element
            // UnComment the code see execution
            // System.out.print("  Array  Before : ");
            // for(int x=low;x<=high;x++){
            //     System.out.print(arr[x]+" ");
            // }

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
    
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
    
            // Swap arr[i+1] and arr[high] (pivot)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
            
            // UnComment the code see execution
            // System.out.print(" After : ");
            // for(int x=low;x<=high;x++){
            //     System.out.print(arr[x]+" ");
            // }
            // System.out.print("  left : ");
            // for(int x=low;x<=i;x++){
            //     System.out.print(arr[x]+" ");
            // }System.out.print(" | "+arr[i+1]+" |Right :");
            // for(int x=i+2;x<=high;x++){
            //     System.out.print(arr[x]+" ");
            // }System.out.println();
    
            return i + 1; // Return the partitioning index
        }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90,2,10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        quick_Sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
