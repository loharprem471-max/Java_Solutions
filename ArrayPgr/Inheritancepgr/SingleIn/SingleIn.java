class Parent
{
	public void displayParent()
	{
		System.out.println("I am Parent class");
	}
}

class Child extends Parent
{
	public void displayChild()
	{
		System.out.println("I am Child class ");
	}
}


class SingleIn 
{
public static void main(String args[])
{
	Child obj=new Child();
	obj.displayParent();
	obj.displayChild();
}

}
	