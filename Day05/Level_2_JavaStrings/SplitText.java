import java.util.*;

public class SplitText {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] customSplit(String str) {
        int length = findLength(str);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ' || i == length - 1) {
                int end = (i == length - 1) ? i + 1 : i;
                words[wordIndex++] = str.substring(start, end);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] customWords = customSplit(sentence);
        String[] builtInWords = sentence.split(" ");

        boolean isSame = compareArrays(customWords, builtInWords);

        System.out.println("Custom Split Result: " + String.join(", ", customWords));
        System.out.println("Built-in Split Result: " + String.join(", ", builtInWords));
        System.out.println("Are both methods equal? " + isSame);
    }
}
