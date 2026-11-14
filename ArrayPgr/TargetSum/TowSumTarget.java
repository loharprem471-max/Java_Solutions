import java.util.Scanner;

class TowSumTarget 
{
public static void main(String args[])
{

   int a[]={1,3,4,8,20,30,40,90,105},i,j;
   int target=108;
   

  System.out.println("Array Elements:");
  for(i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}

System.out.println();
i=0;
j=a.length-1;

	while(i<a.length && j<a.length)
        {
		if((a[i]+a[j])==target)
		{
			System.out.println("Element Found");
			System.out.println(a[i]+"+"+a[j]+"="+target);
			break;
		}
		else if((a[i]+a[j])>target)
		{
			j--;
		}
		else if((a[i]+a[j])<target)
		{
			i++;
		}
	}


if(i>j)
{
	System.out.println("\n Elements not found");
}

}

}
	