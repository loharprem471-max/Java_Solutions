class GrandParent
{
	public void displayGparent()
	{
		System.out.println("I am Grand Parent ");
	}
}

class Parent extends GrandParent
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


class MultiLevelIn 
{
public static void main(String args[])
{
	Child obj=new Child();
	obj.displayGparent();
	obj.displayParent();
	obj.displayChild();
}

}
	