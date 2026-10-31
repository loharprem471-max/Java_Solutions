import java.util.Scanner;

class InsertionSort 
{

public static void main(String args[])
{

   int a[],size,temp,min,j;
  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];
  
 System.out.println("Enter "+size+" Elements in Array  :");

 for(int i=0;i<a.length;i++)
     {
	a[i]=input.nextInt();
     }

System.out.println("\n Array Elements Before Sorting :");
  for(int i=0;i<a.length;i++)
     {
	System.out.print(a[i]+" ");
     }

//insertion Sort Algo

	for(int i=0;i<a.length;i++)
	{
		temp=a[i];
		 j=i;


		while(j>0 && temp<a[j-1])
		{
			a[j]=a[j-1];
			j--;
		}

		a[j]=temp;
	}		


System.out.println("\n Array Elements After Sorting :");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

}

}
	