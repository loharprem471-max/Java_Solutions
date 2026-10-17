import java.util.Scanner;

class ReplaceEvenNum 
{
public static void main(String args[])
{

   int a[]={1,2,3,4,5,6,7,8,9};

  System.out.println("Array Before replacing:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}

 for(int i=0;i<a.length;i++)
     {
	if(a[i]%2==0)
	{
		a[i]=0;
	}
     }

System.out.println("\n Array After Replacing :");

for(int i=0;i<a.length;i++)
{
 	System.out.print(a[i]+" ");
}
}

}
	