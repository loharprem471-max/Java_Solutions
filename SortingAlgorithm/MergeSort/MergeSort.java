import java.util.Scanner;

class MergeSort 
{
int temp[];
int a[];

public void suppMthod(int a[])
{
	this.a=a;
	temp=new int[a.length];

	dividearray(0,a.length-1);
}

public void dividearray(int low,int high)
{

	if(low<high)
	{
		int mid=low+(high-low)/2;

		dividearray(low,mid);
		dividearray(mid+1,high);

		mergeSort(low,mid,high);
	}
}


public void mergeSort(int low,int mid,int high)
{

  for(int i=0;i<a.length;i++)
	{
		temp[i]=a[i];
	}

int l=low;
int m=mid+1;
int k=low;


while(l<=mid && m<=high)
{

	if(temp[l]<=temp[m])
	{
		a[k]=temp[l];
		l++;
	}
	else
	{
		a[k]=temp[m];
		m++;
	}
k++;
}
while(l<=mid)
{
	a[k]=temp[l];
	k++;
	l++;
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
	MergeSort obj=new MergeSort();
	obj.suppMthod(a);


System.out.println("\nAfter Sorting array");

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");

}
}

}
	