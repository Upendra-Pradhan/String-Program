package Com.My_Package.String;

public class CountFirstchar {
	public static void main(String[] args) {
		String s=" java Is  an opp lang";
		char ch []=s.toCharArray( );
		if(ch[0]!=' ') {
			if(ch[0]>='a'&&ch[0]<='z')
				ch[0]=(char)(ch[0]-32);
			
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' '&& ch[i+1]!=' ') {
				if(ch[i+1]>='a'&& ch[i+1]<='z') {
					ch[i+1]=(char)(ch[i+1]-32);
				}
			}
			String res=new String(ch);
			System.out.println(res);
			
		}
	}

	
	}


