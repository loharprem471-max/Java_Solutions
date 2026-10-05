import java.util.Scanner;

class MinNumInArray
{
public static void main(String args[])
{

   int a[],size,min;
  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];
  
 System.out.println("Enter "+size+" Elements in Array  :");

 for(int i=0;i<size;i++)
     {
	a[i]=input.nextInt();
     }

   min=a[0];
  for(int i=1;i<size;i++)
     {
	if(a[i]<min)
	{
		min=a[i];
	}
     }

System.out.println("Min Number of Array is :"+min);


}

}
	