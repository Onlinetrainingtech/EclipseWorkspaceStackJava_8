
public class Demo {

	
	void get1()
	{
		System.out.println("Welcome to get1 method");
	}
	void get2()
	{
		System.out.println("Welcome to get2 methods");
	}
	
	public static void main(String[] args) {
		
		System.out.println("MainIN");
		Demo d1=new Demo();//Object Creation
		d1.get1();
		d1.get2();
		System.out.println("MainOut");
	

	}

}
