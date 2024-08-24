
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] s = S.split("[.]");
        String t = "";
        int n = s.length;

        for (int i = n - 1; i >= 0; i--) {
            t += s[i];
            if (i > 0) {
                t += ".";
            }
        }
        return t; 
    }
}