package stringConcepts;

public class ReverseString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalname="harikrishnan";
		String Reversename ="";
		char ch;
		
		
		for(int i=0;i<originalname.length();i++) {
			
			ch=originalname.charAt(i);
			Reversename=ch+Reversename;				
			
		}
		
		System.out.println(Reversename);
	}

}
