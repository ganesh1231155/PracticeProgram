import java.util.Scanner;

public class downPyramid {
    public static void main(String[] sk) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Height : ");
        int height=sc.nextInt();
        System.out.print("Enter Width : ");
        int width=sc.nextInt();
        for(int i=0;i<height;i++){
            for(int j=0;j<width/2;j++){
                if(j>=i){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            for(int k=(width/2)-1;k>i;k--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
