package HierarchialInheritance;

public class Son extends Father
{
public static void main(String[] args) 
{
	Son s = new Son();
	s.son1();
	s.father1();


}
public void son1()
{
System.out.println("printing son");
}
}
