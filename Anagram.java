package Com.My_Package.String;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String s1,String s2) {
		if(s1.length()==s2.length()) {
			char ch1 []=s1.toCharArray();
			char ch2 []=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String s3=new String(ch1);
			String s4=new String(ch2);
			return s3.equals(s4);
       }
		
			return false;
	}
	public static void main(String[] args) {
		String s1="SILENT";
		String s2="LISTEN";
//		if(isAnagram(s1,s2))
//			System.out.println("Given String is Anagram");
//		else 
//			System.out.println("Given String is not Anagram");
		System.out.println(isAnagram(s1,s2));
	}

}
