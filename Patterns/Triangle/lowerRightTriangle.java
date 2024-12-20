import java.util.Scanner;
public class lowerRightTriangle {
    public static void main(String[] sk) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size of Triangle : ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(j<=i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
