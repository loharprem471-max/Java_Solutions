import java.util.Scanner;

class PrimeNumber
{
  public static void main(String args[])
  {
    int num=0,flag=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a Number :");
    num=input.nextInt();

    for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag=1;
		}
	}

     if(flag==0)
	{
		System.out.println(num+" is Prime Number");
	}
     else
	{
		System.out.println(num+" is not Prime Number");
	}



   }
}