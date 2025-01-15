import java.util.*;

public class VowelConsonantChecker {

    public static String checkCharacterType(char c) {
        char lowerCaseChar = Character.toLowerCase(c);
        
        if (lowerCaseChar >= 'a' && lowerCaseChar <= 'z') {
            if ("aeiou".indexOf(lowerCaseChar) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharacterType(currentChar);
        }
        return result;
    }

    public static void displayArray(String[][] arr) {
        System.out.println("Character | Type");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "        | " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[][] result = findVowelsAndConsonants(input);
        displayArray(result);
    }
}
