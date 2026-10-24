import java.util.Scanner;

class LinearSerach
{
public static void main(String args[])
{

   int a[],size,key,flag=0;
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

System.out.println("\n Enter Searching Element :");
key=input.nextInt();

for(int i=0;i<a.length;i++)
   {
	if(a[i]==key)
	{
		System.out.println(key+" is found at a["+i+"]");
		flag=1;
	}
   }

 if(flag!=1)
{
	System.out.println(key+" is not found in Array");
}

}

}
	