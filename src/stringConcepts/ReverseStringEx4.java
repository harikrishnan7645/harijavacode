package stringConcepts;

public class ReverseStringEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name="message";
     String reversename="";
     char ch;
     for(int i=0;i<name.length();i++) {
    	 ch=name.charAt(i);
    	 reversename=ch+reversename;
     }
     System.out.println(reversename);
	}

}
