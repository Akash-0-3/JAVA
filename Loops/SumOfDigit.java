// Find sum of digits 
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println("Sum of Digits = "+sum);
    }
}
