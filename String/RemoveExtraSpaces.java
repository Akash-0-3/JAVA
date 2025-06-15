//Remove extra spaces – Trim + loop
import java.util.Scanner;
public class RemoveExtraSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scanner.nextLine();
        str = str.trim();
        boolean inspace=false;
        StringBuilder newstr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch==' '){
                if(!inspace){
                    newstr.append(ch);
                    inspace=true;
                }
            }
            else{
                newstr.append(ch);
                inspace=false;
            }
        }
        System.out.println("String after removed extra spaces : "+newstr);
    }
}
