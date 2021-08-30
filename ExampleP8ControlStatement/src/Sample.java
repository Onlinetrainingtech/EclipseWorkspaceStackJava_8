class Demo
{
	int productid=2001;
	void get1()
	{
		if(productid==1001)
		{
			System.out.println("Your ProductId is Equal::"+productid);
		}
		else
		{
			System.out.println("Your Product is not Equal::"+productid);
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();

	}

}
