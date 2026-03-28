package Com.My_Package.String;

public class FindOccurence2 {
	public static void find(String s) {
		String [] st=s.split("\\s +");
		for(int i=0;i<st.length;i++) {
		int count=1;
		for(int j=i+1;j<st.length;j++) {
			if(st[i].equals(st[j])&& st[i]!="") {
				count++;
				st[j]="";
			}
			
		}
		if(st[i]!="");
		System.out.println(st[i]+"--->>>"+count);
	  }
	}
	 public static void main(String[] args) {
		String s=" Hello java java is an hello java";
		find(s);
	}

}
