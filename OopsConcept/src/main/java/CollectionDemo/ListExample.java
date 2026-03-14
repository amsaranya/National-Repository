package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) 
	{
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(1);
		l.add(3);
		l.add(10);
		l.add(20);
		System.out.println(l);
		
		//l.get(2); ->should give inside a printing statement
		System.out.println(l.get(2));
		
		
		System.out.println(l.size());
		
		
		System.out.println(l.isEmpty());
		
		//l.remove(1);
		//System.out.println(l);
		
		
		System.out.println(l.contains(5));
		
		
	
		
		l.set(1, 20);
		System.out.println(l);
		
		System.out.println(l.indexOf(20));
		System.out.println(l.lastIndexOf(20));
		
		//similary can do for string
		
		
		
		
		
		
		
		
		

	}

}
