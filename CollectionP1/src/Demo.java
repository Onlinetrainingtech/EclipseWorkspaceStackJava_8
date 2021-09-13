import java.util.HashSet;
import java.util.Iterator;

class Sample
{
	HashSet<Integer>list1=new HashSet<>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1003);
		
	}
	void get2()
	{
		System.out.println("Value is::"+list1);
		System.out.println("Searching Data is::"+list1.contains(1001));
		System.out.println("TotalSize of data is::"+list1.size());
		System.out.println("Removing data is:::"+list1.remove(1001));
		System.out.println("After Removing Searching Data is::"+list1.contains(1001));
		System.out.println("After Removing TotalSize of data is::"+list1.size());
	}
	void get3()
	{
	    Iterator  g1=list1.iterator();
	    while(g1.hasNext())
	    {
	    	System.out.println("Inside loop data is::"+g1.next());
	    }
	}
}


public class Demo {

	public static void main(String[] args) {
		
		Sample f1=new Sample();
		f1.get1();
		//f1.get2();
		f1.get3();

	}

}
