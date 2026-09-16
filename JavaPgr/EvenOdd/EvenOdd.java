import java.util.Scanner;

class EvenOdd
{
  public static void main(String args[])
  {
    int num=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a Number :");
    num=input.nextInt();

    if(num%2==0)
      {
         System.out.println(num+" is Even Number.");
      }
      else
      {
	 System.out.println(num+" is Odd Number.");
      }
    
     
   }
}