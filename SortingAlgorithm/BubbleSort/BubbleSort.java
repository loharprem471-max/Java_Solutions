import java.util.Scanner;

class BubbleSort
{

public static void main(String args[])
{

   int a[],size,flag=0,temp;
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

//Bubble Sort Algo

	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
				if(flag==0)
				{
					break;
				}
	}
				


System.out.println("\n Array Elements After Sorting :");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

}

}
	