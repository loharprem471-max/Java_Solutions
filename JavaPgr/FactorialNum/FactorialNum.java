import java.util.Scanner;

class FactorialNum
{
  public static void main(String args[])
  {
	int num,fact=1;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();

     for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
  System.out.println("Factorila Of Number :"+fact);
         
     input.close();
   }
}