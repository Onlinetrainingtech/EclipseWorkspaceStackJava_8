class B
{
	int a=100;
	void get1()
	{
		System.out.println("BaseClass is::"+a);
	}

}
class D extends B
{
	void get2()
	{
		System.out.println("Dervided Class is::"+a);
	}
	
public static void main(String[] args) {
		

		D f1=new D();
		f1.get1();
		f1.get2();
		
	}

	

}
