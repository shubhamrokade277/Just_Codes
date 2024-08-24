package Questions;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String s = "anagarm"; 
        String t = "nagaram";

        if (isAnagram(s, t))
            System.out.println("true");
        else
            System.out.println("false");
    }

    public static boolean isAnagram(String s, String t) {
        // Removing white spaces and converting to lowercase for both strings
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Check if sorted arrays are equal
        return Arrays.equals(sArray, tArray);
    }
}
