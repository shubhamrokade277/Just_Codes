// User function Template for Java

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String arr[]) {
        if(arr.length==0){
            return "-1";
        }
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[arr.length-1];
        int i=0;
        while(i<first.length() && i<last.length())
        {
            if(first.charAt(i)==last.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }
        if(i==0){
            return "-1";
        }
        return first.substring(0,i);
    }

    public char[] isPossible(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isPossible'");
    }
}
