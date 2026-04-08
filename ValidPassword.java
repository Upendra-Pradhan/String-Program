package Com.My_Package.String;

import java.util.Scanner;
import java.util.Scanner;

public class ValidPassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("It's a valid password");
        } else {
            System.out.println("It's not a valid password");
        }

        sc.close();
    	
    	String password1="Upwndra1234@#";
    	System.out.println(isValidPassword(password1));
    }

    public static boolean isValidPassword(String password) {

        if (password.contains(" "))
            return false;

        if (password.length() < 8 || password.length() > 15)
            return false;

        if (!password.matches(".*[a-z].*"))
            return false;

        if (!password.matches(".*[A-Z].*"))
            return false;

        if (!password.matches(".*[0-9].*"))
            return false;

        if (!password.matches(".*[!@#$%&*].*"))
            return false;

        return true;
    }
}
























