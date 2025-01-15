import java.util.*;

public class UniqueCharacters {

	//Method to find the length of the text without using the String method length()
    public static int getTextLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

	//method to Find unique characters in a string 
    public static char[] findUniqueCharacters(String text) {
        int length = getTextLength(text);
        char[] uniqueChars = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[index++] = current;
            }
        }

        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
		
		//Create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
