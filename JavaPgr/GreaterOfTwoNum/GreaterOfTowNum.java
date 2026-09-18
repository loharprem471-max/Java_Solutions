import java.util.Scanner;

class GreaterOfTowNum
{
  public static void main(String args[])
  {
	int num1=0,num2=0;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number 1 :");
     num1=input.nextInt();

     System.out.println("Enter a Number 2 :");
     num2=input.nextInt();

      if(num1>num2)
      {
         System.out.println(num1+" is greater Number.");
       }
      else
      {
           System.out.println(num2+" is greater Number.");
      }
     input.close();
   }
}