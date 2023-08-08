package uniqtask;

public class CompileTime {
	
	public static void main(String[] args) {
		
		Gear.add("");
		
	}
	
}
class Gear{
	
	static String name;
	
	static void add(String s1) {
		
		name=s1;
		
		System.out.println(name);	
		
		
	}
	
}

