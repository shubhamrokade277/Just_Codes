package Practice;

import java.util.HashSet;

public class FindOccurance {
    public static void main(String[] args) {
        String str = "idjcnjddjcinncdji";

        HashSet<Character> Repeat = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (!Repeat.contains(str.charAt(i))) {
                Repeat.add(str.charAt(i));
                int count = 0;
                String temp = "";
                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                        temp = temp + str.charAt(i);
                    }
                }
                System.out.println(temp + " " + count);
            }
        }
    }
}
