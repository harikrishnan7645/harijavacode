package exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int b=20/0;
			
		}
catch(ArrayIndexOutOfBoundsException oB) {
	System.out.println("Hi");
}
		catch(ArithmeticException  day) {
			System.out.println("hello");
		}
		finally {
			System.out.println("stop the program");
		}
	}

}
