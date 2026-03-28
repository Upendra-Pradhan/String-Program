package Com.My_Package.String;

public class FindEvenIndex {
	public static void main(String[] args) {
		String s1="UPENDRA";
		for(int i=0;i<s1.length();i++) {
			if(i%2==0) {
				System.out.println(s1.charAt(i));
			}
		}
	}

}
