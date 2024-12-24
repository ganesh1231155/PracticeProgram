

public class maxOccurString {
    public static void main(String sk[]){
        String [] arr={"apple", "banana" ,"apple", "banana", "apple", "cherry"};
        int count[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int x=0;
            for(String j:arr){
                if(arr[i].equals(j)){
                    x++;
                }
            }
            count[i]=x;
        }
        int max=0;
        for(int i=1;i<count.length;i++){
            if(count[i]>count[max]){
                max=1;
            }
        }
        System.out.print("Max Occured String is "+arr[max]);

    }
}
