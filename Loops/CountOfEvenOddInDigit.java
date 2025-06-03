//Count even and odd digits in a number – Loop through digits
import java.util.Scanner;
public class CountOfEvenOddInDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int oddcount = 0;
        int evencount = 0;
        while(n>0){
            int digit = n%10;
            if(digit%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
            n/=10;
        }
        System.out.println("Even Digits : "+evencount);
        System.out.println("Odd Digits : "+oddcount);
    }
}
