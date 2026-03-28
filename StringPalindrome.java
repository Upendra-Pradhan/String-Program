package Com.My_Package.String;

public class StringPalindrome {

    public static void main(String[] args) {
        String s = "MALAYALAM";
        
        if (isPalindrome(s))
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given String is not Palindrome");
    }

    public static boolean isPalindrome(String s) {
        String rev = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        
        return rev.equals(s);
    	
    	/*String s="mam";
    	String emp="";
    	char ch;
    	for(int i=s.length()-1;i>=0;i--) {
    		ch=s.charAt(i);
    		emp+=s.charAt(i);
    	}
    	if(emp.equals(s)) {
    		System.out.println("Given String is Palindrome");
    	}
    	else {
    		System.out.println("Given String is not Palindrome");

    	}*/
    	
    }
}

