package Com.My_Package.String;

public class Count_Alph_Num_Spe_Ch {
	public static void main(String[] args) {
		String s = "UPENDRA@2343--&PRADHAN##1234%$";
		int alphacount = 0;
		int numbercount = 0;
		int specialcount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
				alphacount++;
			else if (ch >= '0' && ch <= '9')
				numbercount++;
			else
				specialcount++;
		}
		System.out.println("Alphacount is:: " + alphacount);
		System.out.println("Numbercount is::" + numbercount);
		System.out.println("Specialcount is::" + specialcount);
	}

}
