import java.util.Scanner;
public class upPyramid {
    public static void main(String sk[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height : ");
        int height=sc.nextInt();
        System.out.print("Enter Width : ");
        int width=sc.nextInt();
        for(int i=0;i<height;i++){
            for(int j=width/2;j>=0;j--){
                if(j<=i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            for(int k=1;k<=i;k++){
                System.out.print(" * ");
            }
            System.out.println();

        }
        
    }
}
