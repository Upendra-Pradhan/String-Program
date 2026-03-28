package Com.My_Package.String;

public class FindOccurence {
	public static void find(String s) {
		while(s.length()<0) {
			char ch=s.charAt(0);
			String s2=s.replace(ch+" "," ");
			int count =s.length()-s2.length();
			System.err.println(ch+"---->>>"+count);
		}
	}
	public static void main(String[] args) {
		String s="Jay maa Mangala";
		find(s);
	}

}
