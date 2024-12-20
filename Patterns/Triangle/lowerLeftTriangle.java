import java.util.Scanner;
public class lowerLeftTriangle {
    public static void main(String[] sk){
        System.out.print("Enter a size of Triangle : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
