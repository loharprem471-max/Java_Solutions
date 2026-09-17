import java.util.Scanner;

class PostNegNum
{
  public static void main(String args[])
  {
	int num=0;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();

      if(num>0)
      {
         System.out.println(num+" is Positive Number.");
       }
       else if(num==0)
       {
             System.out.println("zero is Neutral Number");
       } 
      else
      {
           System.out.println(num+" is Negative Number.");
      }
     input.close();
   }
}