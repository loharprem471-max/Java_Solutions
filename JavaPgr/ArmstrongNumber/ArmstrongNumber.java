import java.util.Scanner;

class ArmstrongNumber
{
int num,orgnum,armnum,digit;

Scanner input=new Scanner(System.in);

public void calArmnum()
{

	System.out.println("Enter a Number :");
	num=input.nextInt();
	orgnum=num;

	while(num>0)
	{
		digit=digit+1;
		num=num/10;
	}
	
	num=orgnum;

	while(num!=0)
	{
		int sum=1;
		int rem=num%10;

		for(int i=0;i<digit;i++)
		{
			sum=sum*rem;
		}
		
		armnum=armnum+sum;
		num=num/10;
	}

	if(armnum==orgnum)
	{
		System.out.println(armnum+" is Armstrong Number.");
	}
	else
	{
		System.out.println(orgnum+" is not Armstrong Number");
	}
}


public static void main(String args[])
{

ArmstrongNumber obj=new ArmstrongNumber();

obj.calArmnum();
}
}
		