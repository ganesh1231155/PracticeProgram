
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        boolean check=true;
        int size=str.length()-1;
        for(int i=0;i<=size;i++){
            if(str.charAt(i)!=str.charAt(size-i))
            {
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("String is Palindrome.");
        }else{
            System.out.println("String is not Palindrome.");

        }
    }
}
