import java.util.Scanner;

class ArrayElementInput
{
public static void main(String args[])
{
  int a[],size;

 Scanner input=new Scanner(System.in);

 System.out.println("Enter a Array Size :");
 size=input.nextInt();

  a=new int[size];

 System.out.println("Enter "+size+" Elements in Array:");

 for(int i=0;i<size;i++)
     {
	a[i]=input.nextInt();
      }
	

System.out.println("Array Elements ");

for(int i=0;i<a.length;i++)
   {
	System.out.print(a[i]+" ");
   }

}

}
	