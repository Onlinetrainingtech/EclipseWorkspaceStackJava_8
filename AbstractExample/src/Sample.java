abstract class Demo
{
	abstract void foo();
	public void get1()
	{
		System.out.println("This is Normal function..");
	}
}
class D extends Demo
{
	public void foo()
	{
		System.out.println("This is Abstract Method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.foo();
		f1.get1();
		

	}

}
