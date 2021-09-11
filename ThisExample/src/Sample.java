
public class Sample {

	int e1;
	String e2;
	void get1(int empid,String empname)
	{
		this.e1=empid;
		this.e2=empname;
		System.out.println("Get1 Function is::"+empid+""+empname);
	}
	void get2()
	{
		System.out.println("Get2 Function is::"+e1+""+e2);
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1(1001,"Mohamed");
		s1.get2();

	}

}
