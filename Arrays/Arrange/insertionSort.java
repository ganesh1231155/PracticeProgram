public class insertionSort {
    public static void main(String[] args) {
        int arr[]={20,4,30,1,10,2};
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int n : arr) {
            System.out.print(n+" ");
        }
    }
}
