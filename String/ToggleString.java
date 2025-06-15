// Toggle character case – “Hello” → “hELLO” 
import java.util.Scanner;
public class ToggleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        StringBuilder toggledstr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                toggledstr.append(Character.toUpperCase(ch));
            }
            else{
                toggledstr.append(Character.toUpperCase(ch));
            }
        }
        System.out.println("Toggled string: "+toggledstr);
    }
}
