import java.util.*;

class StringCharacterComparison {

    // Method to return all characters of a string as a character array without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharacterArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input string from the user
        System.out.print("Enter a string: ");
        String text = input.next();

        // Get characters using user-defined method
        char[] customArray = getCharacters(text);

        // Get characters using the built-in toCharArray() method
        char[] builtInArray = text.toCharArray();

        // Compare the two character arrays
        boolean areEqual = compareCharacterArrays(customArray, builtInArray);

        System.out.println("Characters using user-defined method: " + Arrays.toString(customArray));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(builtInArray));
        
        if (areEqual) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Both arrays are not equal.");
        }
    }
}
