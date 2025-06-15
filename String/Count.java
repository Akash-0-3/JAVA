// Count letters, digits, special chars – Use Character methods 
import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        int lettercount=0;
        int digitcount=0;
        int specialcount=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                lettercount++;
            }
            else if(Character.isDigit(ch)){
                digitcount++;
            }
            else{
                specialcount++;
            }
        }
        System.out.println("Letters : "+lettercount);
        System.out.println("Digits :"+digitcount);
        System.out.println("Special Characters : "+specialcount);
    }
}
