public class CharCountInText {
    public static void main(String[] args) {
        String s1 = "best of both worlds";
        int counter = 0;

        for (int i = 0; i < s1 .length( ; i++ ){
            // for removing blank spaces
            if (s1.charAt(i) != ' ') {
                counter++;
            }
        }
        System.out.println("Total count:" + counter);
    }
}
