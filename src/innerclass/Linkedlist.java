package innerclass;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>al=new LinkedList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
