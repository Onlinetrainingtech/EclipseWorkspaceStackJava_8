
public class MainDemo {

	public void get(int amount) throws AzarDemo
    {
		
    	int sal=2000;
    	if((sal-amount)>500)
    	{
    		throw new AzarDemo();
    	}
    	else
    	{
    		System.out.println("SuccfullyCredited");
    	}
	
		    }
	public static void main(String[] args) throws AzarDemo
	{
		
          MainDemo b=new MainDemo();
          b.get(1000);
	}

}
