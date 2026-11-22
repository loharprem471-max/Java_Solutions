class MissingNum 
{
public static void main(String args[])
{

   int a[]={8,2,4,5,3,7,1};

   int expected_no_Element,total_sum,sum=0;

	expected_no_Element=a.length+1;

	total_sum=expected_no_Element*(expected_no_Element+1)/2;

  System.out.println("Array Elements:");
  for(int i=0;i<a.length;i++)
      {
	 System.out.print(a[i]+" ");
	}


	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
	}
	
	System.out.println("\n Missing element is :"+(total_sum-sum));
}

}
	