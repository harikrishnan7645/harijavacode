package hari;

public class Exception {
	void add() {
		int c=10/0;
	}
	
	void call() {
		try {
			add();
			
	
	    }
		catch(ArithmeticException e ) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception ob =new Exception();
		ob.call();

	}

}
