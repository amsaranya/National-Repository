package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoOfIterator {

	public static void main(String[] args) 
	{
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println(s);

	}

}
