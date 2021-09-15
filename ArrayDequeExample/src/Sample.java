import java.util.ArrayDeque;

public class Sample {

	
	ArrayDeque<Integer>h1=new ArrayDeque<>();
	void get1()
	{
		h1.add(1001);
		h1.add(1002);
		h1.add(1003);
		h1.addFirst(2001);
		h1.addLast(2002);
		h1.removeFirst();
		System.out.println("Your data is::"+h1);
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();

	}

}
