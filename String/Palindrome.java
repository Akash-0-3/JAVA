// Check if string is palindrome – “madam” → yes
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        String revString = "";
        for(int i=str.length()-1;i>=0;i--){
            revString+=str.charAt(i);
        }
        if(str.equals(revString)){
            System.out.println(str+" is palindrome.");
        }
        else{
            System.out.println(str+" is not palindrome.");
        }
    }
}
