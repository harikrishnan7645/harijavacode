package stringConcepts;

public class ReverseStringEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java="mynameissivakumar";
		String Reversejava="";
		char a;
		
		for(int i=0;i<java.length();i++) {
			a=java.charAt(i);
			
			Reversejava=a+Reversejava;
		}
System.out.println(Reversejava);
	}

}
