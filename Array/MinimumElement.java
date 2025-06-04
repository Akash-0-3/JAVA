// Find minimum element – Same, track min
import java.util.Scanner;
public class MinimumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int min=0;
        for(int i=1;i<n;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        System.out.println("Minimum element is "+arr[min]);
    }
}
