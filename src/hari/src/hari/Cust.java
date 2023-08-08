package hari;

public class Cust {
	void donate(int a) {
		
		if(a<18) {
			throw new ArithmeticException("not possible to donate");
		}
		else {
			System.out.println("posible to donate");
		}
	}                 //customized exception ex program
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cust ob=new Cust();
		ob.donate(17);
		

	}

}
