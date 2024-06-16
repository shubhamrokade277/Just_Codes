package Questions;
public class swapping {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        a = a + b;  // a becomes "HelloWorld"
        b = a.substring(0, a.length()-b.length()); // b becomes "Hello"
        a = a.substring(b.length());  // a becomes "World"

        System.out.println(a);
        System.out.println(b);

        
        
    }
}
