//Count digits in a number
import java.util.Scanner;
public class DigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("Count Of digit : "+count);
    }    
}