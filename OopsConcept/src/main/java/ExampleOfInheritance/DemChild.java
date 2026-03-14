package ExampleOfInheritance;

public class DemChild implements DemInter {

	public void method5()
	{
		System.out.println("prining method5 in child class");
	}
	
	
	public static void main(String[] args) 
	{
		
		DemChild d = new DemChild();
		d.method1();
		d.method5();
		
		DemInter e = new DemChild();
		e.method1();
		
	}


	@Override
	public void method1() {
		
		System.out.println("prining method1 in child");
	}


	
}
