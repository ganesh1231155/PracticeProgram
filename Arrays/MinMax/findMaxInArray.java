public class findMaxInArray{
    public static void main(String[] sk){
        int arr[]={20,2,30,10,15};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Max element in an array is : "+max);
    }
}