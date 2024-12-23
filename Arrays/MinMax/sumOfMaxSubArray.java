public class sumOfMaxSubArray {
    public static void main(String[] sk) {
        int arr[]={4,-2,-3,4,2,7,-6,8,-1,-2,3};
        int sum=0;
        int from=0,to=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>(sum+arr[i])){
                sum=arr[i];
                from=i;
            }else{
                sum+=arr[i];
                to=i;
            }
            // }else if(sum<(sum+arr[i])){
            //     sum+=arr[i];
            // }
            // else{
            //     break;
            // }
        }
        System.out.println("Sum of Max Sub-Array : "+sum+" from position "+(from+1)+" to "+(to+1));
    }
}
