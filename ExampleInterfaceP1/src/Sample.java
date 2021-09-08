interface Product
{
	int productid=1001;
	void addProduct();
}
interface Category extends Product
{
	int categoryid=2001;
	void addCategory();
}
class D implements Category
{
	public void addProduct()
	{
		System.out.println("Your ProductId is::"+productid);
	}
	public void addCategory()
	{
		System.out.println("Your CategoryId is::"+categoryid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D f1=new D();
		f1.addProduct();
		f1.addCategory();

	}

}
