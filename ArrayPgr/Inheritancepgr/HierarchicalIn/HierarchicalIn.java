class Parent
{
	public void displayParent()
	{
		System.out.println("I am Parent class");
	}
}

class Child1 extends Parent
{
	public void displayChild()
	{
		System.out.println("I am Child1 class ");
	}
}



class Child2 extends Parent
{
	public void displayChild()
	{
		System.out.println("I am Child2 class ");
	}
}

class HierarchicalIn 
{
public static void main(String args[])
{
	Child1 obj1=new Child1();
	obj1.displayParent();
	obj1.displayChild();

System.out.println("--------------------------------------");
	Child2 obj2=new Child2();
	obj2.displayParent();
	obj2.displayChild();
}

}
	