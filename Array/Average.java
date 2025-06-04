// Find average of array – Sum ÷ total elements 
import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i] =scanner.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Average = "+(sum/n));
    }
}
