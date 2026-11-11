import java.util.Scanner;

class ArrayElementAsOrder
{
public static void main(String args[])
{

   int a[],size,temp;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];

 System.out.println("Enter "+size+" Elements in Array :");

 for(int i=0;i<size;i++)
     {
	a[i]=input.nextInt();
     }


  
System.out.println("\nArray Elements ");

for(int i=0;i<a.length;i++)
   {
	System.out.print(a[i]+" ");
   }


for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}


System.out.println("\nArray in Ascending Order :");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}
 

}

}
	