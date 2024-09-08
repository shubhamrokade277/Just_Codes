package Practive;

public class Str {
    public static void main(String[] args) {
        String str = "akraakrr";

        for(int i=0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            int temp = 0;
            int count=0;
            while(temp<str.length()){
                if(curr==str.charAt(temp)){
                    count++;
                    System.out.print(str.charAt(i));
                }
                temp++;
            }
            System.out.print(count);
            System.out.println();
        }
    }
}
