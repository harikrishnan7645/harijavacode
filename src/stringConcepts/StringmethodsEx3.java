package stringConcepts;




public class StringmethodsEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="rolling chair";
      //contains:to check whether words or char present or not 
    System.out.println(s.contains(" "));
    System.out.println(s.contains("air"));
    System.out.println(s.contains("g"));   // output is true
      
    
    //char:to check the char position
    System.out.println(s.charAt(4));      ///output is i
    
    
    //join: to join two string
    String s1="tea";
    String s2="coffe";
    System.out.println(s1.join("*","tea","coffe"));    //output is tea*coffe
    
    //equals:both string should be same case print true or false
    String s3="usha";
    String s4="USHA";
    System.out.println(s3.equals(s4));    // output is false
    
    //equalIgnorecase: both string not necessary should be same case
    String s5="doit";
    String s6="DOIT";
    System.out.println(s5.equalsIgnoreCase(s6));  // output is true
    
    
    //concat:merge two strings
    String s7="youtube";
    String s8="videos";
    System.out.println(s7.concat(s8));      // output is youtubevideos
    
    //split: to split two string
    String s9="cauverynews";
  String[] strArray = s9.split("e");
  for(String str : strArray)      //output is 
  {
	  System.out.print(str+" ");
  }
  System.out.println();
    
    //length:to check the length of the string
  String s11="jasmine";
    System.out.println(s11.length());
    
    //trim: to cut end spaces
    String s10=(" count start ");
    System.out.println(s10.trim()); // output is count start
    
    //format():to erase the given string
    String s12="my name is %s";
    System.out.println(s12.format(s12,"hari"));
    
    
    //substring(): to print two to three char
    System.out.println(s7.substring(0,4));    // output is yout
    
    //startswith():to check 
    System.out.println(s7.startsWith("t"));   // output is false
    
    //endsWith():
    System.out.println(s8.endsWith("e"));     //output is false
    
    //intern():cloning
    System.out.println(s8.intern());   // output is videos
    
    //replace():replace char
    System.out.println(s7.replace("u", "a"));   // output is yoatabe
    
    //replaceAll():
    System.out.println(s7.replaceAll(s10, s7));
    
    
    
    
    
    		
    		
    		
	}

}
