final class B
{
	final int a=100;
	void get1()
	{
		System.out.println("BaseClass Value is::"+a);
	}
}
class D extends B
{
	void get2()
	{
	    a=200;
		System.out.println("This Dervided Class Value is::"+super.a);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.get1();
		f1.get2();

	}

}
