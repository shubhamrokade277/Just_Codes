import java.util.HashSet;

public class AnagramPalindrome {
    public static int isPossible(String S) {
        HashSet<Character> set = new HashSet<>();
        char[] ch = S.toCharArray();

        for (int i = 0; i < S.length(); i++) {
            if (set.contains(ch[i])) {
                set.remove(ch[i]);
            } else {
                set.add(ch[i]);
            }
        }

        if (set.size() <= 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(AnagramPalindrome.isPossible("geeksogeeks")); // Output: 1
        System.out.println(AnagramPalindrome.isPossible("geeksforgeeks")); // Output: 0
    }
}
/*
 * If the size of the HashSet is 0 or 1, it means the string can be rearranged
 * into a palindrome.
 * 0 indicates that all characters have even occurrences.
 * 1 indicates that one character has an odd occurrence, which is allowed for
 * palindromes of odd length.
 * If the size of the HashSet is greater than 1, it's impossible to rearrange
 * the string into a palindrome.
 */