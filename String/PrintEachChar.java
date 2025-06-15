//Print each character – Loop through string 
import java.util.Scanner;
public class PrintEachChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scanner.nextLine();
        System.out.println("Characters in a String : ");
        for(char ch : str.toCharArray()){
            System.out.println(ch);
        }
    }
}
