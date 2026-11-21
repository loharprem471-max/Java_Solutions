class MissingNumOR 
{
public static void main(String args[])
{

   int a[]={8,2,4,5,3,7,1};

   int num1=0,num2=0,size;

	size=a.length+1;

  System.out.println("Array Elements:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}


	for(int i=0;i<a.length;i++)
	{
		num1=num1^a[i];
	}

	for(int i=1;i<=size;i++)
	{
		num2=num2^i;
	}

	
	System.out.println("\n Missing element is :"+(num1^num2));
}

}
	