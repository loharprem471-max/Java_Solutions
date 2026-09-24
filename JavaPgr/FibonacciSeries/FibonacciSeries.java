import java.util.Scanner;

class FibonacciSeries
{
  public static void main(String args[])
  {
	int range,a=0,b=1,c;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Series Range :");
     range=input.nextInt();

     for(int i=1;i<=range;i++)
	{
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
         
     input.close();
   }
}