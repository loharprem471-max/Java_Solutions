import java.util.Scanner;

class SumOfThreeArray 
{
public static void main(String args[])
{

   int a1[],a2[],a3[],sum[],size,even=0,odd=0;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a1=new int[size];
  a2=new int[size];
  a3=new int[size];
  sum=new int[size];

 System.out.println("Enter "+size+" Elements in Array 1 :");

 for(int i=0;i<size;i++)
     {
	a1[i]=input.nextInt();
     }


 System.out.println("Enter "+size+" Elements in Array 2 :");

 for(int i=0;i<size;i++)
     {
	a2[i]=input.nextInt();
     }


 System.out.println("Enter "+size+" Elements in Array 2 :");

 for(int i=0;i<size;i++)
     {
	a3[i]=input.nextInt();
     }



for(int i=0;i<a1.length;i++)
   {
	sum[i]=a1[i]+a2[i]+a3[i];
   }

System.out.println("Sum of 3 Arrays Elements ");

for(int i=0;i<size;i++)
   {
	System.out.println("a1["+a1[i]+"] + a2["+a2[i]+"] + a3["+a3[i]+"] = sum["+sum[i]+"]");
    }

}

}
	