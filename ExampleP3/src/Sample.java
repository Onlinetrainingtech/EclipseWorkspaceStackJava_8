class Product
{
	String pname="apple";//class variable
	String cname="mobile";
	void addProduct()
	{
		int productid=1001;//local variable
		System.out.println("Your ProductId is::"+productid+"Your ProductName:"+pname);
		
	}
	void addCategory()
	{
		System.out.println("Your CategoryName is::"+cname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.addProduct();
		p1.addCategory();

	}

}
