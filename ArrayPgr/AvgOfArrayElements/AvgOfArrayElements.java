import java.util.Scanner;

class AvgOfArrayElements 
{
public static void main(String args[])
{

   int a[],size,sum=0,avg;

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
	sum=sum+a[i];
   }

avg=(sum/a.length);
System.out.println("Sum of Array Elements :"+sum);
System.out.println("Average of Array Elements :"+avg);
}

}
	