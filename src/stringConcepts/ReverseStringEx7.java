package stringConcepts;

public class ReverseStringEx7 {

	public static void main(String[] args) {
		 
		String name="numbersystem";
		String  Reversename ="";
		char r;
		
		for(int i=0;i<name.length();i++) {
			r=name.charAt(i);
			Reversename=r+Reversename;
			
			
			
			
			
		}
		
		System.out.println(Reversename);

	}

}
