package innerclass;

import java.util.ArrayList;
import java.util.Iterator;

public class TestjavaCollection  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("ravi");
		list.add("vijay");
		list.add("ajay");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
