public class findSecondMin {
    public static void main(String[] args) {
        int arr[]={20,2,30,10,1,15};
        int min=arr[0];
        int secMin= 2147483647;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }else if(arr[i]<secMin&& arr[i]!=min){
                secMin=arr[i];
            }
        }
        System.out.print("Second Min : "+secMin+"\nMin : "+min);
    }
}
