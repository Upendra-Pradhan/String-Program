package Com.My_Package.String;

public class ReverseStringcharacterArray {
	public static void main(String[] args) {
		String s="alagnaM aaM yaJ";
		String rev="";
		char a[]=s.toCharArray();
		int len=a.length;
		for( int i=len-1;i>=0;i--) {
			//rev=rev+a[i];
			rev+=a[i];
			
		}
		System.out.println("Reverse String is::"+rev);
	}
}
