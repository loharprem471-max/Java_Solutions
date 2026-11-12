

class CommonElementArray 
{
public static void main(String args[])
{

   int a1[]={10,2,4,13,44,90},a2[]={13,26,60,23,4,234};

  
System.out.println("\nCommon Element in Array a1 & a2 ");

for(int i=0;i<a1.length;i++)
   {
	for(int j=0;j<a2.length;j++)
	{
		if(a1[i]==a2[j])
		{
			System.out.print(a1[i]+" ");
		}
	}
   }

}

}
	