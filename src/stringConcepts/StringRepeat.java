package stringConcepts;

public class StringRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s5= new String("harikrishnan");
	    String s6=s5.intern();
	    System.out.println(s6);
	    System.out.println(s5);
	    System.out.println(s6==s5);
		

	}

}
