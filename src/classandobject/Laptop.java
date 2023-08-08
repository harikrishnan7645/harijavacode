package classandobject;

public class Laptop {
	     double displaysize=15.6;
	     float keyboardsize=15.8f;
	

	public static void main(String[] args) {
		
		Laptop dell=new Laptop();
		dell.captureCamera();
		 dell.displaysize=14.6;
	     dell.keyboardsize=14.8f;
		
		System.out.println(dell.displaysize);
		System.out.println(dell.keyboardsize);
		
         
		
		
		Laptop acer=new Laptop();
		 acer.displaysize=13.6;
	     acer.keyboardsize=13.8f;
		
		
         acer.captureCamera();
         System.out.println(acer.displaysize);
         System.out.println(acer.keyboardsize);
         
         
         
        Laptop lenovo=new Laptop();
        lenovo.captureCamera();
        lenovo.displaysize=12.6;
	     lenovo.keyboardsize=12.8f;
        
        System.out.println(lenovo.displaysize);
        System.out.println(lenovo.keyboardsize);
         
	}


       public void captureCamera() {
    	   
       }
       }