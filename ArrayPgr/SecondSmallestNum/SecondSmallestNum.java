import java.util.Scanner;

class SecondSmallestNum  
{
public static void main(String args[])
{

   int a[],size,temp;

   int smallest=Integer.MAX_VALUE;
   int secondsmal=Integer.MAX_VALUE;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];
  
 System.out.println("Enter "+size+" Elements in Array  :");

 for(int i=0;i<size;i++)
     {
	a[i]=input.nextInt();
     }


   
  for(int i=0;i<size;i++)
     {
		if(a[i]<smallest)
		{
			secondsmal=smallest;
			smallest=a[i];
		}
		else if((a[i]<secondsmal) && (a[i]!=smallest))
		{
			secondsmal=a[i];
		}

     }


if(smallest==(Integer.MAX_VALUE))
{
	System.out.println("No any Second Smallest Element found");
}

System.out.println("\nSecond Smallest Number is :"+secondsmal);


}

}
	