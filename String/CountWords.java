// Count words in a sentence – Split by space
import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence=sentence.trim();
        String[] words = sentence.split("\\s+");
        System.out.println("Number of words : "+words.length);
    }
}
