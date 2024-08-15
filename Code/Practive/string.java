class string {
    public static void main(String[] args) {
        String str = "Hello World";
        String a = "a";
        String b = "b";

        System.out.println(str);
        //System.out.println(str.charAt(1));
        //System.out.println(str.charAt(2));

        System.out.println(a.codePointAt(0));

        //System.out.println(a.compareTo(b));

        System.out.println(a.equals(b));
        System.err.println(a.concat(b));

        System.out.println(str.substring(4,7));


    }
}