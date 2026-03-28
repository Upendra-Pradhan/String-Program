package Com.My_Package.String;

import java.util.Scanner;

public class OccurenceChareter {
	
	private static String Find_Occurance(String s, char ch) {
		  int count=0;
		  for(int i=0;i<s.length();i++) {
			  if(s.charAt(i)==ch)
				  count++;
		  }
		  return ch+"--->>>"+count;
	}
	public static void main(String[] args) {
		String s1="Banana";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		System.out.println("Enter a Character to find Occurance");
		char ch=sc.next().charAt(0);
		System.out.println(Find_Occurance(s,ch));
		
		
	}

}
