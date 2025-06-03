//Print all even and odd numbers from 1 to N – Use if condition inside loop.
import java.util.Scanner;
public class EvenOdd {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Num : ");
    int n = scanner.nextInt();
    for(int i=1;i<=n;i++){
        if(i%2==0){
            System.out.println(i+" is Even");
        }
        else{
            System.out.println(i+" is Odd");
        }
    }
 }   
}
