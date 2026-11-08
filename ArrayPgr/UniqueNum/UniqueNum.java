import java.util.Scanner;

class UniqueNum 
{
public static void main(String args[])
{

   int a[]={1,2,3,2,1,3,1008,4,1,4};
   

  System.out.println("Array Elements:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}

	int num=a[0];

	for(int i=1;i<a.length;i++)
	   {
		num=num^a[i];
	    }

	for(int i=1;i<a.length;i++)
	{
		num^=i;
	}
System.out.println("\n non-repeating element is :"+num);
}

}
	