package uniqtask;

public class Student  {
	int rollno;
	String name;
	String city;
	Student(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
		
	}
	public String toString() {
		return rollno+" "+name+" "+city;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s1=new Student(101,suresh,walajah);
		Student s2=new Student(102,hari,sholingur);
		System.out.println(s1);
		System.out.println(s2);
		
		
		

	}

}
