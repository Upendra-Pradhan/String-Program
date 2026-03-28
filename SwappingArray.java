package Com.My_Package.String;

public class SwappingArray {
	public static void main(String[] args) {
		String s1="Java", s2="Programming";
		System.out.println("<<<---Before Swapping--->>>");
		System.err.println();
		
		System.out.println("String s1: "+s1);
		System.out.println("String s2: "+s2);
		System.err.println();
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("<<<---Affter Swapping--->>>");
		System.out.println();
		System.out.println("String s1:"+s1);
		System.out.println("String s2:"+s2);
		
	}

}
