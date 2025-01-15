import java.util.Scanner;

public class ShortestLongestWord {
    public static String[][] getWordsWithLengths(String[] words) {
        // Same method as question 3
    }

    public static String[] findShortestLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];

        for (String[] word : wordLengths) {
            if (word[0].length() < shortest.length()) shortest = word[0];
            if (word[0].length() > longest.length()) longest = word[0];
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = customSplit(sentence);
        String[][] wordLengths = getWordsWithLengths(words);
        String[] shortestLongest = findShortestLongest(wordLengths);

        System.out.println("Shortest Word: " + shortestLongest[0]);
        System.out.println("Longest Word: " + shortestLongest[1]);
    }
}
