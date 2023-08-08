package stringConcepts;

public class ReverseStringEx2 {

	public static void main(String[] args) {
		
		String name="harikrishnan";
		String reversename ="";
		char ch;
		
		for(int i=0;i<name.length();i++) {
		ch=name.charAt(i);	
		reversename=ch+reversename;
		}
		System.out.println(reversename);

	}
}
