package stringConcepts;

public class ReverseStringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="bollywood";
		String Reverseb="";
		char s;
		
		for(int i=0;i<b.length();i++) {
			s=b.charAt(i);
			Reverseb=s+Reverseb;
		}
System.out.println(Reverseb);
	}

}
