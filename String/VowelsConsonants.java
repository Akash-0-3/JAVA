//Count vowels and consonants
import java.util.Scanner;
public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();
        str=str.toLowerCase();
        int vowelcount = 0;
        int consonantcount = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelcount++;
            }
            else{
                consonantcount++;
            }
        }
        System.out.println("Vowels in a string : "+vowelcount);
        System.out.println("Consonants in a string : "+consonantcount);
    }
}
