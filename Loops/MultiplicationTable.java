// Print multiplication table of a number
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        System.out.println("Multiplication Table of "+n);
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
