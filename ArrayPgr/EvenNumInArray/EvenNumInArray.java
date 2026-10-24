import java.util.Scanner;

class EvenNumInArray
{
public static void main(String args[])
{

   int a[],size,count=0;

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
		count++;
	  }
   }

System.out.println("Count of Even Number in Array  :"+count);
}

}
	