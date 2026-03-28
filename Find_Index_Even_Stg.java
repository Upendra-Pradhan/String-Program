package Com.My_Package.String;

public class Find_Index_Even_Stg {
	

//	public static void main(String[] args) {
//		String s="java";
//		char[] ch=s.toCharArray();
//		for(int i=0;i<s.length();i++) {
//			if(i%2==0) {
//				System.out.println(ch[i]);
//				if(i+2<ch.length)
//					System.out.println(",");
//			}
//		}
//	}
	public static void main(String[] args) {
		String s="JAVA";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				if(i==s.length()-1 || i== s.length()-1)
					System.out.println(s.charAt(i));
				else
					System.out.print(s.charAt(i)+",");
			}
			
		}
	}

}
