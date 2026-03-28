package Com.My_Package.String;

import java.util.Scanner;

public class Valid_EmailId {
 public static boolean isvalidEmail(String Emailid) {
	 if(Emailid.contains(" "))
		 return false;
	 if(Emailid.length()<8 || Emailid.length()>15)
		 return false;
	 if(!Emailid.matches(".*[a-z].*"))
		 return false;
	 if(!Emailid.matches(".*[A-Z].*"))
		 return false;
	 if(!Emailid.matches(".*[0-9].*"))
		 return false;
	 if(!Emailid.matches(".*[!@#$%&*].*"))
		 return false;
	  
	 return true;
	 
	 
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your valid Emailid");
	String Emailid=sc.next();
	if(isvalidEmail(Emailid)) {
		System.out.println("It's Valid EmailId");
		
	}
	else {
		System.out.println("It's not valid Emailid");
	}
}
}
