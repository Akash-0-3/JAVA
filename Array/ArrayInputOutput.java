// Input and print an array – Take n elements from user and print 
import java.util.Scanner;
public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" array Elements");
        for(int i=0;i<n;i++){
           arr[i] = scanner.nextInt(); 
        }
        System.out.println("The elements in the array are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
