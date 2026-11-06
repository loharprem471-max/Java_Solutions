import java.util.Scanner;

class UniqueNum 
{
public static void main(String args[])
{

   int a[]={1,2,3,11,2,3,1,4,5,2,4,6,6,5};
   int num;

  System.out.println("Array Elements:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}

	num=a[0];

	for(int i=1;i<a.length;i++)
	   {
		num=num^a[i];
	    }

	for(int i=1;i<a.length;i++)
	{
		num=num^i;
	}

System.out.println("\non-repeating element is :"+num);
}

}
	