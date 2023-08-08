package stringConcepts;

public class ReverseStringEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String d="movieisfullofcomedy";
          String Reversed="";
          char s;
          for(int i=0;i<d.length();i++) {
        	  s=d.charAt(i);
        	  Reversed=s+Reversed;
          }
          System.out.println(Reversed);
	}

}
