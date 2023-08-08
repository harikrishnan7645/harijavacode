package hari;
class Invalid ageException extends Exception{
	Invalid ageException(String s) {
		Super(s);
	}
}

public class Cus {
	static void age(int b) {
		(b>18){
			System.out.println("posible");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			age(20);
		}
		catch() {
			System.out.println("not possible");
		}

	}

}
