class ShiftZeroEnd 
{
public static void main(String args[])
{

   int a[]={10,2,0,4,0,00,13,0,44,0,90};

  
System.out.println("Array Before shifting Zeros\n");

for(int i=0;i<a.length;i++)
   {
	
	System.out.print(a[i]+" ");
   }


 int i=0,j=0;

while(i<a.length && j<a.length)
{
	if(a[j]!=0)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
	}
	j++;
}

System.out.println("\n\nArray after shifting Zeros\n");


for( i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}


}

}
	