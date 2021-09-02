class Demo
{
	int reverse=0;
	int n=123;
	void get1()
	{
		
		while (n != 0)
		   {
		      reverse = reverse * 10;
		      reverse = reverse + n%10;
		      n       = n/10;
		   }
		System.out.println("Reverse Number is::"+reverse);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
	

	}

}
