package collection;

import java.util.*;

 class College {
	private String name;
	private int id;
	College(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String getname() {
	return name;
	
	}
	public int getid() {
		return id;
	}
	}
public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<College>al=new ArrayList<College>();
		al.add(new College("SRM",2));
		al.add(new College("A",3));
		al.add(new College("B",5));
	for(College x:al) {
		System.out.println(x.getname()+" "+x.getid());

	}

}
}
