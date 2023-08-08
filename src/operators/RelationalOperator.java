package operators;

public class RelationalOperator {
   int a=20;
	public static void main(String[] args) {
		
		int a=30;
		int b=20;
		int c=40;
		   
		RelationalOperator relationaloperat=new RelationalOperator();
		relationaloperat.hari();
		 System.out.println(a>=b);
		 System.out.println(a>=c);        // output is 1.true 2.false
		System.out.println(a==b);        // equality

		System.out.println(a!=b);      // not equal

	}
  public void hari() {
	  int a=30;
	  System.out.println(this.a);
	  this.hari1();
  }
  
  public void hari1() {
	  int a=30;
	  System.out.println(this.a);
  }
}
