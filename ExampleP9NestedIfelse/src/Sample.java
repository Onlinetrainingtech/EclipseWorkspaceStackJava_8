import java.util.Scanner;

class Demo
{
	int age,salary,bns,tot;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the value is::");
		age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("Enter the salary is::");
			salary=sc.nextInt();
			if(salary>=20000)
			{
				bns=salary+500;
				System.out.println("Your salary details is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your salary details is::"+bns);
			}
		}
		else
		{
			System.out.println("Your Age is low");
		}
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		

	}

}
