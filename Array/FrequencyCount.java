// Count frequency of an element – e.g., count how many 5’s 
import java.util.Scanner;
public class FrequencyCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to find frequency : ");
        int searchelement=scanner.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(searchelement==arr[i]){
                count++;
            }
        }
        System.out.println("Frequency of "+searchelement+" is "+count); 
    }
}
