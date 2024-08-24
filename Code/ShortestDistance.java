import java.util.ArrayList;

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int minLength = Integer.MAX_VALUE;
        
        ArrayList<Integer> start = new ArrayList();
        ArrayList<Integer> end = new ArrayList();
        
        for(int i=0; i<s.size(); i++) {
            
            if(s.get(i).equals(word1)){
                 start.add(i);
            }
            if(s.get(i).equals(word2)){
                end.add(i);
            }   
        }
        
        for(Integer w1 : start) {           
            for(Integer w2 : end) {              
                minLength = Math.min(Math.abs(w2-w1), minLength);               
            }
        }       
        return minLength;
    }
}