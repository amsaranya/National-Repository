package Aggregation;

public class Student {
	int c;
	int d;
	School m;
	
	public void method2(int c,int d, School m)
	{
		this.c = c;
		this.d = d;
		this.m = m;
			
	}
	
	public void method3()
	{
		System.out.println(c);
		System.out.println(d);
		//System.out.println(m);
		System.out.println(m.canteen);
		System.out.println(m.library);
	}
	public static void main(String[] args) 
	{
		School q = new School();
		q.method1("School canteen", "School library");
		
		
		
		Student p = new Student();
		p.method2(10, 20, q);
		p.method3();

	}

}
