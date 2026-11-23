import java.util.Scanner;

class SecondSmallestNumLp   
{
public static void main(String args[])
{

   int a[],size,temp;
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
	for(int j=i+1;j<a.length;j++)
	{

		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

	if(i==1)
	{
		break;
	}
     }


System.out.println("Array Elements:");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

System.out.println("\nSecond Smallest Number is :"+a[1]);


}

}
	