import java.util.*;

public class WordsWithLengths {
    public static String[] customSplit(String str) {
        // Same customSplit method as question 2
    }

    public static int findLength(String str) {
        // Same findLength method as question 1
    }

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = customSplit(sentence);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        System.out.println("Word\tLength");
        for (String[] wordInfo : wordsWithLengths) {
            System.out.println(wordInfo[0] + "\t" + wordInfo[1]);
        }
    }
}
