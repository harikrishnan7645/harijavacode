package classandobject;

public class Twowheeler {
          int price=2000;
          String name="yamaha";
          
	public static void main(String[] args) {
		
		System.out.println("this is my first program");
		
		
		Twowheeler mybike = new Twowheeler(); 
		mybike.herohonda();
		mybike.price=3000;
		System.out.println(mybike.price);
        System.out.println(mybike.name);
        System.out.println("this is my first bike "+ mybike.name+" my bike price "+mybike.price);
		
        Twowheeler mybike2 = new Twowheeler(); 
           mybike2.price=5000;
           mybike2.name="herohonda";
		 
		 
		 
		 System.out.println(mybike2.price);
		 System.out.println(mybike2.name);
		 System.out.println("this is my second bike "+ mybike2.name+" my bike price "+mybike2.price);
			
		 		 
		 
	}

      public  void herohonda() {
    	  System.out.println("hari");
    	      
    	  
      }
}

