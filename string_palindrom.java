public class string_palindrom {
    public static void main(String[] args) {
        String str = "abcdcba";
        StringBuilder gtr = new StringBuilder(str);
        String s = gtr.reverse().toString();
        // String s=gtr+" ";

        if (str.equals(s)) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number  not palindrom");
        }
    }
}



                 




















