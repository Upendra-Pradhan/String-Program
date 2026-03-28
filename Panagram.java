package Com.My_Package.String;

public class Panagram {
	public static boolean isPanagram(String s) {
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1)
				return false;
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s="The Quick Brown Fox Jumps Over the Lazy Dog";
		s=s.toLowerCase();
		if(isPanagram(s))
			System.out.println("Given String is Panagram");
		else
			System.out.println("Given String is not Panagram");
	}

}
