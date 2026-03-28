package Com.My_Package.String;

public class Vowel {
	public static void main(String[] args) {
		String s=" java is an oop lang";
		int count=0;
		s=s.toLowerCase();
		char [] ch=s.toCharArray();
		if(ch[0]!=' ') {
			if(ch[0]=='a' || ch[0]=='e' || ch[0]=='i' ||ch[0]=='u' || ch[0]=='o')
				count ++;
			
				
		}
		
		for(int i=0; i<ch.length;i++) {
			if(ch[i]==1 && ch[i+1]!=' ') {
				if(ch[i+1]=='a'|| ch[i+1]=='e'|| ch[i+1]=='i' || ch[i+1]=='o' || ch[i+1]=='u')
					count++;
			}
		}
		System.out.println(" TOTAL WORDS STARTS WITH VOWELS ARE: "+count);
				
		
	
	}

}
