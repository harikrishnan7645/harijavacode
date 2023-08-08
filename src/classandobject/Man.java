package classandobject;

public class Man {
	int height=174;
	int weight=80;
	String name="krishnan";
	String lastname="mani";

	public static void main(String[] args) {
		
		Man hari=new Man();
		
		System.out.println(" my name is " + hari.name+" my lastname is  "+hari.lastname + " my height"+ hari.height+ "my weight is"+ hari.weight);
         System.out.println(hari.name);
         System.out.println(hari.height);
         System.out.println(hari.lastname);
         
         Man suresh=new Man();
          suresh.height=178;
         suresh.weight=79;
         System.out.println(suresh.height);
         System.out.println(suresh.weight);
         System.out.println(suresh.name);
         System.out.println("my friend name is suresh "+ " my friend height is "+suresh.height+suresh.weight);
	}

}
