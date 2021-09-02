import java.util.Scanner;

class Demo
{
	int i,n,fact=1;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial value is::"+fact);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
