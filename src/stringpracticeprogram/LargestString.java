package stringpracticeprogram;

public class LargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="cinema";
		String s2="chicken";
		String s3="chennaikjh";
		System.out.println();
		int a = s1.length();
		int b = s2.length();
		int c = s3.length();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		if (a>b && a>c)
		{
			System.out.println("a is larger");
			System.out.println(s1);
		}
		else if(b>c && b>a)
		{
			System.out.println("b is larger");
			System.out.println(s2);
		}
		else
		{
			System.out.println("c is larger");
			System.out.println(s3);
		}
	}

}
