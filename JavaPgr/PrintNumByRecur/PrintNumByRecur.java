import java.util.Scanner;

class PrintNumByRecur
{
  
public void printNum(int i,int range)
{
      if(i==range)
        {
	   return;
         }
     System.out.println(i);
       printNum(i+1,range);
}

public static void main(String args[])
{
	PrintNumByRecur obj=new PrintNumByRecur();
         Scanner input=new Scanner(System.in);

      System.out.println("Enter a Range :");
       int num=input.nextInt();

    obj.printNum(1,num);
}

}
	