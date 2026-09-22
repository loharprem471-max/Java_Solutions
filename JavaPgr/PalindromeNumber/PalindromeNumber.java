import java.util.Scanner;

class PalindromeNumber 
{
  public static void main(String args[])
  {
	int num=0,rem=0,revsnum=0,orgnum=0;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();
     orgnum=num;

     while(num>0)
     {
       rem=num%10;
       revsnum=revsnum*10+rem;
       num=num/10;
      }

      if(revsnum==orgnum)
	{
		System.out.println(revsnum+" is Palindrome Number");
         }
        else
	{
		System.out.println(revsnum+" is not Palindrome Number");
        }
		         
     input.close();
   }
}