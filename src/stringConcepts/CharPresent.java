package stringConcepts;

public class CharPresent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalname="harikrishnan";
		String Reversename ="";
		char ch;
		
		
		for(int i=0;i<originalname.length();i++) {
			
			ch=originalname.charAt(i);
			if(ch=='h') {
				System.out.println("h is present");
			}
			else {
				System.out.println("h is not present");
			}
			Reversename=ch+Reversename;	
			
			
		}
		
		System.out.println(Reversename);
	}

}
