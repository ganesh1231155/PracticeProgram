
public class findSecondMax {
    public static void main(String sk[]){
        int arr[]={40,2,30,10,15};
        int max=arr[0];
        int secMax=-1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }else if( arr[i]>secMax && arr[i]!=max)
            {
                secMax=arr[i];
            }
        }
        System.out.print("Second Max : "+secMax+"\n Max :"+max);
    }
}
