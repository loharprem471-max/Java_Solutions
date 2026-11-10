import java.util.Scanner;

class RepeatingNum 
{
public static void main(String args[])
{

   int a[]={1,2,20,33,40,1008,4,1},flag=0;
   

  System.out.println("Array Elements:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}


	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
				{
					flag=1;
					break;
				}
			}
	if(flag==1)
	{		
		System.out.println("\n repeating element is :"+a[i]);
		break;
	}
}
}

}
	