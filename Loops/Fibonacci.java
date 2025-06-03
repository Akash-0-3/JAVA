// Print Fibonacci series up to N terms – Use loop with 2 variables to track
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in fibonacci series : ");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }
}
