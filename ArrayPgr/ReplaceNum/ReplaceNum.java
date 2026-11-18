
class ReplaceNum 
{
public static void main(String args[])
{

   int a[]={10,20,30,40,50,1008,1,2,3,4,5},temp,i,j;

  System.out.println("Array Before replacing:");
  for( i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}

 i=0;
 j=a.length-1;

	while(i<=j)
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
	}

System.out.println("\n Array After Replacing :");

for(i=0;i<a.length;i++)
{
 	System.out.print(a[i]+" ");
}
}

}
	