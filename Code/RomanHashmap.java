public int romanToDecimal(String str) {
   
    HashMap<Character,Integer> mp = new HashMap<>();
    mp.put('I',1);
    mp.put('V',5);
    mp.put('X', 10);
    mp.put('L' ,50);
    mp.put('C', 100);
    mp.put('D' ,500);
    mp.put('M' ,1000);
    
    int n= str.length();
    int ans=0, last=0;
    for(int i=n-1; i>=0; i--){
        int curr = mp.get(str.charAt(i)); //X IV
        if(curr >= last){
            ans+= curr;
            last= curr;
        }
        else{
            ans-= mp.get(str.charAt(i));
        } 
    }
    return ans;
    
}

