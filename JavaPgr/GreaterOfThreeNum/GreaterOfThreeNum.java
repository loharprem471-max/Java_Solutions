import java.util.Scanner;

class GreaterOfThreeNum
{
  public static void main(String args[])
  {
	int num1=0,num2=0,num3=0;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number 1 :");
     num1=input.nextInt();

     System.out.println("Enter a Number 2 :");
     num2=input.nextInt();

     System.out.println("Enter a Number 3 :");
     num3=input.nextInt();

      if(num1>num2)
      {
          if(num1>num3)
          {
            System.out.println(num1+" is greater Number.");
          }
          else
          {
              System.out.println(num3+" is greater Number.");
           }
       }
      else if(num2>num3)
      {
           System.out.println(num2+" is greater Number.");
      }
      else
      {
             System.out.println(num3+" is greater Number.");
       }
     input.close();
   }
}