interface Parent2
{
	public void displayParent2();
}

class Parent1
{
	public void displayParent1()
	{
		System.out.println("I am Parent1 class");
	}
}

class Child extends Parent1 implements Parent2
{

	
	public void displayParent2()
	{
		System.out.println("I am Parent2 class(interface) ");

	}

	public void displayChild()
	{
		System.out.println("I am Child class ");
	}
}


class MultipleIn 
{
public static void main(String args[])
{
	Child obj=new Child();
	obj.displayParent1();
System.out.println("-------------------------------------");
	Parent2 obj2=new Child();
	obj2.displayParent2();

	obj.displayChild();
}

}
	