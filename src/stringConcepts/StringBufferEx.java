package stringConcepts;

import java.nio.ShortBuffer;

public class StringBufferEx {

	public static void main(String[] args) {
		
		// create string buffer object
      StringBuffer str= new StringBuffer();
      
      
      // add a object to append
      str.append("hari");
      
      //find a char position
      str.charAt(3);
      
      //print statements
      System.out.println(str.toString());
      System.out.println(str.charAt(3));          // output is hari,i
      
	}

}
