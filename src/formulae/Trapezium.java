package formulae;

public class Trapezium {

	public static void main(String[] args) {
		
		int a=30;
		int b=10;
		int c=5;
		int d=25;
		int h=34;
		double p=0.5;
		int perimeter=a+b+c+d;  
		double area=p*h*(a+b);
		System.out.println("trapeziumperimeter="+perimeter);
		System.out.println("trapeziumarea="+area);

	}

}
