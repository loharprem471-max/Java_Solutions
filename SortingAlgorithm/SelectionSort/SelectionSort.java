import java.util.Scanner;

class SelectionSort 
{

public static void main(String args[])
{

   int a[],size,temp,min;
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

//Selection Sort Algo

	for(int i=0;i<a.length;i++)
	{
		min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[min]>a[j])
			{
				min=j;
			}
		}
	   temp=a[i];
	   a[i]=a[min];
	   a[min]=temp;
	}		


System.out.println("\n Array Elements After Sorting :");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

}

}
	