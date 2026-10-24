import java.util.Scanner;

class ArrayPrintByRcur
{

public void rcurPrint(int i,int a[])
{
	if(i==(a.length))
	{
		return ;
	}
	System.out.print(a[i]+" ");

	i++;

	 rcurPrint(i,a);
}
	
public static void main(String args[])
{

   int a[],size;

  ArrayPrintByRcur obj=new ArrayPrintByRcur();
  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];

 System.out.println("Enter "+size+" Elements in Array :");

 for(int i=0;i<size;i++)
     {
	a[i]=input.nextInt();
     }

  
System.out.println("Array Elements:");
obj.rcurPrint(0,a);

}

}
	