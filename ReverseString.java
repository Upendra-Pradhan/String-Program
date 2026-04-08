package Com.My_Package.String;

public class ReverseString {
	public static void main(String[] args) {
		String s = "UPENDRA";
		String rev = "";
		int len = s.length(); // 4
		for (int i = len - 1; i >= 0; i--) // 3 2 1 0 -1
		{
			rev = rev + s.charAt(i); // rev+=s.charAt(i)
		}
		System.out.println("Reverse String:: " + rev);
	}

}
