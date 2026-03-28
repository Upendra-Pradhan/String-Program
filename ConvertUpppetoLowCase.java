package Com.My_Package.String;

public class ConvertUpppetoLowCase {
	public static void main(String[] args) {
		String s="UE NDR A";
		int count=0;

		System.out.println(s.toLowerCase());
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
              count ++;
			}

		}
		System.out.println(count);

	}

}
