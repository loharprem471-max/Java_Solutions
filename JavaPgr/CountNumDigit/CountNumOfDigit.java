import java.util.Scanner;

class CountNumOfDigit
{
  public static void main(String args[])
  {
	int num=0,count=0;

      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();

     while(num>0)
     {
	count=count+1;
       num=num/10;
      }

System.out.println("Number of Digits is:"+count);
         
     input.close();
   }
}