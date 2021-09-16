
public class Sample {
	int a=100/2;
	String name=null;
	void get1()
	{
		
		try
		{
		System.out.println("InGet-1");
		
		System.out.println("InOut-2");
		System.out.println("Lengthof the String::"+name.length());
		}
		catch(ArithmeticException r)
		{
			System.out.println("Please check your division.."+r);
		}
		catch(NullPointerException t)
		{
			System.out.println("Check your variable..."+t);
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 functions.."+a);
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		

	}

}
