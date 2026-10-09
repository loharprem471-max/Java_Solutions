import java.util.Scanner;

class MulTable
{
  public static void main(String args[])
  {
	int num=0;
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();

System.out.println(num+" Table ");

for(int i=1;i<=10;i++)
    {
	System.out.println(i+" * "+num+" = "+i*num);
    }
         
     input.close();
   }
}