 //Calculate factorial of a number.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int fact = 1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
