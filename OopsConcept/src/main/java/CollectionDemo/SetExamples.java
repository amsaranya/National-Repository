package CollectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args)
	{
		Set <Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s);
		Set <Integer> s2 = new HashSet<Integer>();
		s2.add(5);
		s2.add(6);
		s2.add(7);
		s2.add(8);
		System.out.println(s2);
		s.addAll(s2);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s.size());
		System.out.println(s2.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(3));
		System.out.println(s.containsAll(s2));
		System.out.println(s2.containsAll(s));
		s.remove(4);
		System.out.println(s);
		s.removeAll(s2);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		
		
		
		
		
		
		

	}

}
