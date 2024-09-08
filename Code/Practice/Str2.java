// Give an string Like str="akraakrrr" I wsant to find if any char
// in string is repeating itself and Print its all occurences along with the occurance count like this:
// aaa:3  kk:2 rrrr:4

package Practice;

import java.util.HashSet;

public class Str2 {
    public static void main(String[] args) {
        String str = "akraakrr";
        HashSet<Character> processed = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (!processed.contains(curr)) {
                processed.add(curr);
                int temp = 0;
                int count = 0;

                while (temp < str.length()) {
                    if (curr == str.charAt(temp)) {
                        count++;
                        System.out.print(curr);
                    }
                    temp++;
                }

                System.out.println(" :"+count);
            }
        }
    }
}
