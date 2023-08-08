package stringConcepts;

public class ReverseStringEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="bouncing";
		String reversename="";
		char s;
		for(int i=0;i<name.length();i++) {
			s=name.charAt(i);
			reversename=s+reversename;
			
		}
System.out.println(reversename);
	}

}
