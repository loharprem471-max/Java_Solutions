import java.util.Scanner;

class ReverseNumber
{
  public static void main(String args[])
  {
	int num=0,rem=0,revsnum=0;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();

     while(num>0)
     {
       rem=num%10;
       revsnum=revsnum*10+rem;
       num=num/10;
      }

System.out.println("Reverse Number :"+revsnum);
         
     input.close();
   }
}