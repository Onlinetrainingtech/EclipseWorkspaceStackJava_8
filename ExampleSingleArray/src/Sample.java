import java.util.Scanner;

class Demo
{
	int productid[]=new int[5];
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			productid[i]=sc.nextInt();
			
		}
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("Array value is::"+productid[i]);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
