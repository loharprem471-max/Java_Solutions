class CommElThreeArray  
{
public static void main(String args[])
{

   int a1[]={10,2,4,13,44,90},a2[]={13,26,60,23,4,234},a3[]={23,56,234,65,34};

  
System.out.println("\nCommon Element in Array a1 , a2 & a3");

for(int i=0;i<a1.length;i++)
   {
	for(int j=0;j<a2.length;j++)
	{
		for(int k=0;k<a3.length;k++)
		{

			if((a1[i]==a2[j])&&(a2[i]==a3[k]))
			{
				System.out.print(a1[i]+" ");
			}
		}
	}
   }

}

}
	