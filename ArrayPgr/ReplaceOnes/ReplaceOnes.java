import java.util.Scanner;

class ReplaceOnes 
{
public static void main(String args[])
{

   int a[]={1,2,1,4,1,1,7,1,9};

  System.out.println("Array Before replacing:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}

 for(int i=0;i<a.length;i++)
     {
	if(a[i]==1)
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
	