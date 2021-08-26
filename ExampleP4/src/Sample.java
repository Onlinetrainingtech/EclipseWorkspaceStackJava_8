class Demo
{
	void get1(int empid,String empname)
	{
		System.out.println("Your data is::"+empid+"\n"+empname);
	}
	void get2(int accid,String staffname)
	{
		System.out.println("Your get2 function::"+accid+""+staffname);
	}
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"azar");
		f1.get2(2001,"mohamed");

	}

}
