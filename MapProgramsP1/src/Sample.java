import java.util.HashMap;
import java.util.Map;

public class Sample {

	HashMap<Integer,String>g1=new HashMap<>();
	
	void get1()
	{
		g1.put(101,"Azar");
		g1.put(102,"Mohan");
		g1.put(103,"mohamed");
		
		//System.out.println(g1.entrySet());
		
		for(Map.Entry m:g1.entrySet())
		{
			System.out.println(m);
			
			System.out.println("Your value is::"+m.getKey()+""+m.getValue());
		}
		System.out.println("Your size is::"+g1.size());
		System.out.println("Remove the element is::"+g1.remove(101));
		System.out.println("Searching My Data is::"+g1.containsKey(101));
		
		int i=101;
		System.out.println(g1.get(i));
	}
	
	public static void main(String[] args) {
	
		Sample d1=new Sample();
		d1.get1();

	}

}
