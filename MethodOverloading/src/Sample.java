class Demo
{
	void get1(int empid,String empname)
	{
		System.out.println("EmployeeInfromation:::"+empid+""+empname);
	}
	void get1(int productid,int pprice)
	{
		System.out.println("ProductInfromation:::"+productid+""+pprice);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(2001,"Azar");
		f1.get1(1001,100);

	}

}
