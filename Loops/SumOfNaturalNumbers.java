//Find sum of first N natural numbers – Use loop or formula.
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum : "+sum);
    }   
}
