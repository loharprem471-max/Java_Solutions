import java.util.Scanner;

class SumOf3DArray  
{
public static void main(String args[])
{

   int a1[][][],a2[][][],sum[][][],size;

  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a1=new int[size][size][size];
  a2=new int[size][size][size];
   sum=new int[size][size][size];

 System.out.println("Enter  Elements in Array 1 :");

 for(int i=0;i<a1.length;i++)
     {
	for(int j=0;j<a1[i].length;j++)
	{
		for(int k=0;k<a1[i][j].length;k++)
		{
			a1[i][j][k]=input.nextInt();
		}
	}
     }


 System.out.println("Enter  Elements in Array 2 :");

 for(int i=0;i<a2.length;i++)
     {
	for(int j=0;j<a2[i].length;j++)
	{
		for(int k=0;k<a1[i][j].length;k++)
		{
			a2[i][j][k]=input.nextInt();
		}
		
	}
     }




for(int i=0;i<a1.length;i++)
   {
	for(int j=0;j<a1[i].length;j++)
	{
		for(int k=0;k<a1[i][j].length;k++)
		{
			sum[i][j][k]=a1[i][j][k]+a2[i][j][k];
		}
	}
   }


System.out.println("sum of array1 and array2 :");


for(int i=0;i<sum.length;i++)
	{
		for(int j=0;j<sum[i].length;j++)
		{
			for(int k=0;k<sum[i][j].length;k++)
			{
				System.out.print(sum[i][j][k]+" ");
			}
		}
	System.out.println();
	}

}

}
	