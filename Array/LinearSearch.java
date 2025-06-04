// Linear search – Find if element exists in array 
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter search element : ");
        int searchelement=scanner.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==searchelement){
                System.out.println(searchelement+" found at index "+i+".");
                found=true;
                break;
            }       
        }
        if(!found){
            System.out.println(searchelement+" not found.");
        }
    }
}
