// Count even and odd numbers in array
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements : ");
        for(int i =0;i<n;i++){
            arr[i] =scanner.nextInt();
        }
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even Numbers Count = "+evencount);
        System.out.println("Odd Numbers Count  = "+oddcount);
    }
}
