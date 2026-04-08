package Com.My_Package.String;

public class SwappingString2 {

public static String reverse(String s) {
		
		char ch[]=s.toCharArray();
		int st=0,end=ch.length-1;
		while(st<end) {
			char temp=ch[st];
			ch[st]=ch[end];
			ch[end]=temp;
			st++;
			end--;
			
		}
		return new String(ch);

		}
	public static void main(String[] args) {
		String s="JAVA";
		System.out.println(reverse(s));
	}

}