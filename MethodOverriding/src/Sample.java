class B
{
	void show()
	{
		System.out.println("This is Show BaseClass");
	}
}
class D1 extends B
{
	void show()
	{
		System.out.println("This is Show D1");
	}
}
class D2 extends B
{
	void show()
	{
		System.out.println("This is Show D2");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		B f1=new B();
		D1 f2=new D1();
		D2 f3=new D2();
		
		B ref;
		ref=f1;
		ref.show();
		
		ref=f2;
		f2.show();
		
		ref=f3;
		f3.show();
		
				

	}

}
