import java.util.*;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Accept the word to be replaced and the new word
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        // Replace the word in the sentence
        String updatedSentence = replaceWord(sentence, oldWord, newWord);

        // Output the updated sentence
        System.out.println("Updated sentence: " + updatedSentence);
    }

    
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Use String.replaceAll() to replace all occurrences of the word
        // "\\b" ensures we replace only whole words, not substrings
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }
}
