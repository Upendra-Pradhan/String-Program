package Com.My_Package.String;

public class ReverEachWord {
	
	public static void main(String[] args) {
		String s1= "java is a an oop language";
		System.out.println(reverse(s1));
	}
	private static String reverse(String s1) {
		String st[]=s1.split(" ");
		String rev="";
		for(int i=st.length-1;i>=0;i--) {
			rev+=st[i]+" ";
			
		}
		return rev.trim();
		
		
	}

}

/*public class ReverEachWord {

    public static void main(String[] args) {
        String s1 = "java is a an oop language";
        System.out.println(reverse(s1));
    }

    private static String reverse(String s1) {
        String[] st = s1.split(" ");
        String rev = "";

        for (int i = st.length - 1; i >= 0; i--) {
            rev += st[i]+" ";
        }

        return rev.trim();
    }
}*/

