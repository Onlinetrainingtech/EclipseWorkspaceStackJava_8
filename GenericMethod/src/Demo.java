
public class Demo {

	public <M>M test(M t)
	{
		return t;
	}
	public static void main(String[] args) {
		
		Demo g=new Demo();
		System.out.println(g.test(101));
		System.out.println(g.test(2.5));
		System.out.println(g.test("azar"));

	}

}
