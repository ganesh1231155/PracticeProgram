
import java.util.Scanner;
public class upperLeftTriangle{
    public static void main(String sk[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Size of traingle");
        int  a=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=i;j<a;j++)
            {
                //if(i<=j){
                    System.out.print(" * ");
                //}
            }
            System.out.println();
        }
    }
}