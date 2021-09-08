class B
{
	int a=100;
}
class D1 extends B
{
	int b=200;
}
class D2 extends D1
{
	int c;
	void get()
	{
		c=a*b;
		System.out.println("Result is::"+c);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get();

	}

}
