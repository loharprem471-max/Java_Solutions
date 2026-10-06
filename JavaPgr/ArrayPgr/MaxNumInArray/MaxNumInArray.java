import java.util.Scanner;

class MaxNumInArray 
{
public static void main(String args[])
{

   int a[],size,max;
  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];
  
 System.out.println("Enter "+size+" Elements in Array  :");

 for(int i=0;i<size;i++)
     {
	a[i]=input.nextInt();
     }

   max=a[0];
  for(int i=1;i<size;i++)
     {
	if(a[i]>max)
	{
		max=a[i];
	}
     }

System.out.println("Max Number of Array is :"+max);


}

}
	