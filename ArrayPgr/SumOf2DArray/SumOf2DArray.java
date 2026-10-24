import java.util.Scanner;

class SumOf2DArray 
{
public static void main(String args[])
{

   int a1[][],a2[][],sum[][],size;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a1=new int[size][size];
  a2=new int[size][size];
   sum=new int[size][size];

 System.out.println("Enter "+(size*2)+" Elements in Array 1 :");

 for(int i=0;i<size;i++)
     {
	for(int j=0;j<a1[i].length;j++)
	{
		a1[i][j]=input.nextInt();
	}
     }


 System.out.println("Enter "+(size*2)+" Elements in Array 2 :");

 for(int i=0;i<size;i++)
     {
	for(int j=0;j<a1[i].length;j++)
	{
		System.out.printf("\t");
		a2[i][j]=input.nextInt();
		
	}
     }




for(int i=0;i<a1.length;i++)
   {
	for(int j=0;j<a1[i].length;j++)
	{
		sum[i][j]=a1[i][j]+a2[i][j];
	}
   }


System.out.println("sum of array1 and array2 :");


for(int i=0;i<size;i++)
	{
		for(int j=0;j<a1[i].length;j++)
		{
			System.out.print(sum[i][j]+" ");
		}
	System.out.println();
	}

}

}
	