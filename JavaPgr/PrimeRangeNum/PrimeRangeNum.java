import java.util.Scanner;

class PrimeRangeNum
{

public static void main(String args[]) 
{

int range = 0, flag = 0;
Scanner input = new Scanner(System.in);
System.out.println("Enter a Range :");
range = input.nextInt();


System.out.println("Prime Numbers :");


for(int i=1;i<=range;i++)
{
  for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag=1;
		}
	}
   if(flag==0)
     {
	System.out.println(i+"");
	
     }
	flag=0;


}


}
}
