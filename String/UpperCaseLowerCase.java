// Convert string to uppercase/lowercase – Use toUpperCase(), toLowerCase()
import java.util.Scanner;
public class UpperCaseLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        System.out.println("Original String : "+str);
        System.out.println("LowerCase String : "+str.toLowerCase());
        System.out.println("UpperCase String : "+str.toUpperCase());
    }
}
