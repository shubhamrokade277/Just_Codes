//java program to find character frequency of given string eg for string "aakkt" a:2 k:2 t:1 

package Questions;

import java.util.HashMap;
import java.util.Map;

public class que3 {
    public static void main(String[] args) {
        String str1 = "AaSentenseIsConsistingof";
        String str = str1.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i =0; i< str.length(); i++) {
            char ch = str.charAt(i);
    
            if (map.containsKey(ch)) {
                map.put(ch, (map.get(ch)+1));
            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
        
    }
}
