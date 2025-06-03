//Find product of digits – 123 → 1×2×3 = 6 
import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int product= 1;
        while(n<0){
            product*=(n%10);
            n/=10;
        }
        System.out.println("Product of digits = "+product);
    }
}
