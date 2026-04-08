package Com.My_Package.String;

public class RemoveSpecialCh {
	public static void main(String[] args) {
		String s="UPENDRA@2343--&PRADHAN##1234%$";
		String rev=" ";
		char ch;
	
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				rev+=ch;
			}
			
		}
		System.out.println(rev);
		
	}

}
