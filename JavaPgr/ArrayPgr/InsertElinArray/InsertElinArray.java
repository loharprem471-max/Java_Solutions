import java.util.Scanner;

class InsertElinArray
{
public static void main(String args[])
{

   int a[],temp[],size,pos,num;
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

System.out.println("\n Enter Element want to insert :");
num=input.nextInt();

System.out.println("Enter Position to Insert Element :");
pos=input.nextInt();


temp=new int[a.length+1];

for(int i=0;i<a.length;i++)
{
	temp[i]=a[i];
}

for(int i=temp.length-1;i>=pos-1;i--)
   {
	temp[i]=temp[i-1];
    }

temp[pos-1]=num;

System.out.println("Array After Element Insertion :");

for(int i=0;i<temp.length;i++)
{
   System.out.print(temp[i]+" ");
} 


}

}
	