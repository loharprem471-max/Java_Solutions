import java.util.Scanner;

class DeleteElinArray
{
public static void main(String args[])
{

   int a[],size,num;
  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];
  
 System.out.println("Enter "+size+" Elements in Array  :");

 for(int i=0;i<a.length;i++)
     {
	a[i]=input.nextInt();
     }

System.out.println("Array Elements :");
  for(int i=0;i<a.length;i++)
     {
	System.out.print(a[i]+" ");
     }

System.out.println("\n Enter Element want to Delete:");
num=input.nextInt();

for(int i=0;i<a.length;i++)
   {
	if(a[i]==num)
	{
		for(int j=i;j<a.length-1;j++)
		{
			a[j]=a[j+1];
		}
		break;
	}
   }

a[a.length-1]=0;
System.out.println("Array After Element Deletion :");

for(int i=0;i<a.length;i++)
{
   System.out.print(a[i]+" ");
} 


}

}
	