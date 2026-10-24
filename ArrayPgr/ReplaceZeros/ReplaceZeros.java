import java.util.Scanner;

class ReplaceZeros 
{
public static void main(String args[])
{

   int a[]={0,2,0,4,0,6,7,0,9};

  System.out.println("Array Before replacing:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}

 for(int i=0;i<a.length;i++)
     {
	if(a[i]==0)
	{
		a[i]=1;
	}
     }

System.out.println("\n Array After Replacing :");

for(int i=0;i<a.length;i++)
{
 	System.out.print(a[i]+" ");
}
}

}
	