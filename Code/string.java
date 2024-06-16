public class string {
    public static void main(String[] args) {
        String myStr = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr.charAt(0)); //H
        System.out.println(myStr.codePointAt(0)); //gets unicode

        //-1 value of mystr (A) is smaller than mystr2 (B)
        //0 if equal
        //1 value of mystr (B) is smaller than mystr2 (A)
        System.out.println(myStr.compareTo(myStr2));

        //true if equal & false if not
        System.out.println(myStr.equals(myStr2)); //true

        System.out.println(myStr.concat(myStr2)); //HelloHello

        System.out.println(myStr.contains("H")); //true

        System.out.println(myStr.indexOf("e")); //1

        System.out.println(myStr.length()); //6

        System.out.println(myStr.substring(1)); //ello

        System.out.println(myStr.substring(1,2)); //e

    }
}
