package stringConcepts;

public class ReverseStringEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hari="blackboard";
		String Reversehari="";
		char u;
		
		for(int i=0;i<hari.length();i++) {
			u=hari.charAt(i);
		
		Reversehari=u+Reversehari;
		
		
		}
		
		System.out.println(Reversehari);
	}

}
