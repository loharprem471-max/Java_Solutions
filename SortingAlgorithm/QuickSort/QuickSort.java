import java.util.Scanner;

class QuickSort 
{


public int qSort(int low,int high,int a[])
{
	int pivot=a[(high+low)/2];

	while(low<high)
	{
		while(a[low]<pivot)
		{
			low++;
		}
		while(a[high]>pivot)
		{
			high--;
		}
		
		if(low<=high)
		{
			int temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
	}
return low;
}



public void startSort(int low,int high,int a[])
{

	int p=qSort(low,high,a);

	if(p-1>low)
	{
		qSort(low,p-1,a);
	}
	if(p<high)
	{

		qSort(p,high,a);
	}
}
			


public static void main(String args[])
{

	int a[]={90,80,70,30,1,3,5};

System.out.println("Before Sorting array :");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");

}
	QuickSort obj=new QuickSort();

	obj.startSort(0,a.length-1,a);


System.out.println("\nAfter Sorting array");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");

}
}

}
	