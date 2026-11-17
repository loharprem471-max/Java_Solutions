import java.util.Scanner;

class SecondLargestNum  
{
public static void main(String args[])
{

   int a[],size,temp;

   int largest=Integer.MIN_VALUE;
   int secondLarg=Integer.MIN_VALUE;

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
		if(a[i]>largest)
		{
			secondLarg=largest;
			largest=a[i];
		}
		else if((a[i]>secondLarg) && (a[i]!=largest))
		{
			secondLarg=a[i];
		}

     }


if(largest<0)
{
	System.out.println("No any Second Largest Element found");
}

System.out.println("\nSecond Largest Number is :"+secondLarg);


}

}
	