// Print Floyd’s Triangle – 1 2 3, 4 5 6 … using nested loops 
import java.util.Scanner;
public class FloydTringle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = scanner.nextInt();
        int num=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");
        }
    }
}
