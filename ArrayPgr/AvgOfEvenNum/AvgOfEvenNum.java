import java.util.Scanner;

class AvgOfEvenNum 
{
public static void main(String args[])
{

   int a[],size,sum=0,avg,count=0;

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
		sum=sum+a[i];
		count++;
	  }
   }

avg=sum/count;
System.out.println("Total Even Numbers :"+count);
System.out.println("Sum of Even Number :"+sum);
System.out.println("Average of Even Number :"+avg);
}

}
	