import java.util.Scanner;

class DigitInNum
{
  public static void main(String args[])
  {
	int num=0,digit=0;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();

	while(num>0)
	{
		digit++;
		num=num/10;
	}
         

	System.out.println("Digits in Number is :"+digit);
     input.close();
   }
}