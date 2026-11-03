import java.util.Scanner;

class FibonacciSeriesRcr
{
int c;
public void fibseries(int a, int b,int range)
{

	if(range==1)
	{
		return;
	}
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;

	 fibseries(a,b,range-1);
}

  public static void main(String args[])
  {
	int range,a=0,b=1;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Series Range :");
     range=input.nextInt();

    FibonacciSeriesRcr obj=new FibonacciSeriesRcr();

	obj.fibseries(a,b,range);
         
     input.close();
   }
}