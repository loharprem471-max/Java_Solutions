import java.util.Scanner;

class BinarySerach 
{
public static void main(String args[])
{

   int a[],size,key,low,hig,temp;
  Scanner input=new Scanner(System.in);

  System.out.println("Enter a Array size :");
  size=input.nextInt();
  a=new int[size];
  
 System.out.println("Enter "+size+" Elements in Array  :");

 for(int i=0;i<a.length;i++)
     {
	a[i]=input.nextInt();
     }

for(int i=0;i<a.length;i++)
   {
	for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
    }
System.out.println("Array Elements :");
  for(int i=0;i<a.length;i++)
     {
	System.out.print(a[i]+" ");
     }

System.out.println("\n Enter Searching Element :");
key=input.nextInt();

low=0;
hig=a.length-1;

while(low<=hig)
{
	int mid=low+(hig-low)/2;

	if(a[mid]==key)
	{
		System.out.println(key+" is found at index a["+mid+"]");
		break;
	}
	else if(a[mid]<key)
	{
		low=mid+1;
	}
	else if(a[mid]>key)
	{
		hig=mid-1;
	}
}
 if(low>hig)
{
	System.out.println(key+" is not found in Array");
}

}

}
	