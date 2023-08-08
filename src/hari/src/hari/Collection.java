package hari;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>B=new ArrayList<String>();
		B.add("praveen");
		B.add("bala");
		B.addAll(B);
		Iterator itr=B.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
