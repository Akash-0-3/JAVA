// Replace spaces with dashes – “hello world” → “hello-world” 
import java.util.Scanner;
public class ReplaceSpaceToDash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();
        str=str.replace(' ','-');
        System.out.println("Replaced string : "+str);
    }
}
