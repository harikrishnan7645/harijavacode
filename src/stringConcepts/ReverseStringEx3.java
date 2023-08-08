package stringConcepts;

public class ReverseStringEx3 {

	public static void main(String[] args) {
		
		String s="mycomputerisfail";
		String Reverses="";
		char d;
		for(int i=0;i<s.length();i++) {
			d=s.charAt(i);
			Reverses=d+Reverses;
		}
System.out.println(Reverses);
	}

}
