//  Find maximum element – Loop through array, track max
import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int max=0;
        for(int i=1;i<n;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        System.out.println("Maximum element is "+arr[max]);
    }
}
