//Reverse a number 
import java.util.Scanner;
public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse : ");
        int n = scanner.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        System.out.println("Reversed Number : "+rev);
    }    
}
