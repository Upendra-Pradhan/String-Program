package Com.My_Package.String;

public class Count_Space {
	public static void main(String[] args) {
		String s="AA BC   DEF   GH IJ K";
		int count =0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
				
			}
		}
		System.out.println("Total Space are:"+count);

	}

}
