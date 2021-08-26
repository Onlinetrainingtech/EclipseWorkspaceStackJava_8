import java.io.*;

class Foo
{
	int empid;
	String empname;
	float avg;
	DataInputStream dis=new DataInputStream(System.in);
	void get1() throws  IOException
	{
		System.out.println("Enter the Inputs::");
		empid=Integer.parseInt(dis.readLine());
		empname=dis.readLine();
		avg=Float.parseFloat(dis.readLine());
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+empname+""+avg);
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		Foo f1=new Foo();
		f1.get1();
		f1.display();

	}

}
