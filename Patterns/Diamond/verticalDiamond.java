import java.util.Scanner;
public class verticalDiamond {
    public static void main(String sk[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Height of diamond : ");
        int height=sc.nextInt();
        if(height%2==1){
            height+=1;
        }
        for(int i=0;i<height;i++){
            if(i<height/2){
                for(int j=height/2;j>=0;j--){
                    if(j<=i){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                for(int j=0;j<i;j++){
                    System.out.print(" * ");
                }
            }
            else{
                for(int j=height/2-1;j<height;j++){
                    if(j>i){
                    System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                for(int j=height-2;j>i;j--){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
