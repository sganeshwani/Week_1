import java.util.*;

public class FrequencyOfCharacters {

    public static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;
                result[index][1] = frequency[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = input.nextLine();

        int[][] result = findCharacterFrequency(input);
        System.out.println("Character - Frequency");
        for (int[] entry : result) {
            System.out.printf("%c - %d%n", entry[0], entry[1]);
        }
    }
}
