package Com.My_Package.String;

public class StringPalindrome2 {

    public static boolean reverse(String s) {
        char[] ch = s.toCharArray();
        int st = 0, end = ch.length - 1;

        while (st < end) {
            if (ch[st] != ch[end]) {
                return false;
            }
            st++;
            end--;
        }
        return true;  // Must return true if no mismatch
    }

    public static void main(String[] args) {
        String s = "MADAM";

        if (reverse(s))
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given String is Not Palindrome");
    }
}

	
