
public class Sample {

	
	Sample()//Default Cons
	{
		System.out.println("Default Functions");
	}
	Sample(String uname)//Param Cons
	{
		System.out.println("ParamFunctions::"+uname);
	}
	void get1()
	{
		System.out.println("This is Normal Method");
	}
	
	public static void main(String[] args) {
		
		new Sample();
		Sample t1=new Sample("Azar");
		t1.get1();

	}

}
