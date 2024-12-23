public class findMinInArray {
    public static void main(String sk[]){
        int arr[]={20,2,30,10,1,15};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print("Minimum element of an array : "+min);
    }
}
