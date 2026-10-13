import java.util.Scanner;

class ReverseNumRcur
{

int revnum;

public int revNum(int num)
{
       if(num==0)
	{
		return revnum;
	}

	int rem=num%10;
	revnum=revnum*10+rem;
	num=num/10;
	
	return revNum(num);
}
  public static void main(String args[])
  {
	int num=0,revsnum=0;
	ReverseNumRcur obj=new ReverseNumRcur();
      Scanner input=new Scanner(System.in);

     System.out.println("Enter a Number :");
     num=input.nextInt();


System.out.println("Reverse Number :"+obj.revNum(num));
         
     input.close();
   }
}