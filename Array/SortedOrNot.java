// Check if array is sorted – Ascending or not 
import java.util.Scanner;
public class SortedOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        boolean isSorted = true;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }       
        }
        if(isSorted){
            System.out.println("The array is sorted in ascending order.");
        }
        else{
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
