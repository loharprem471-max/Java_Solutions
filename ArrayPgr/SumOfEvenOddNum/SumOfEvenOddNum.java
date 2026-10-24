import java.util.Scanner;

class SumOfEvenOddNum
{
public static void main(String args[])
{

   int a[],size,even=0,odd=0;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];

 System.out.println("Enter "+size+" Elements in Array :");

 for(int i=0;i<size;i++)
     {
	a[i]=input.nextInt();
     }


for(int i=0;i<a.length;i++)
   {
	if(a[i]%2==0)
          {
		even=even+a[i];
	  }
	 else
	{
		odd=odd+a[i];
	}
   }

System.out.println("Sum of Even Number :"+even);
System.out.println("Sum of Odd Number :"+odd);
}

}
	