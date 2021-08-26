import java.util.*;

class Product
{
	int productid;
	String pname;
	//char bloodgroup;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is::");
		pname=sc.next();
		productid=sc.nextInt();
		
		//bloodgroup=sc.next().charAt(0);
	}
	void display()
	{
		System.out.println("Your ProductId::"+productid);
		System.out.println("Your pname is::"+pname);
		//System.out.println("Your bloodgroup is::"+bloodgroup);
	}
}


public class Sample {

	
	
	public static void main(String[] args) {
		
		Product f1=new Product();
		f1.input();
		f1.display();

	}

}
