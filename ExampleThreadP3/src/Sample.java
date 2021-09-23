class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
			Thread.sleep(1000);
		    System.out.println("This is run method.."+i);
			}
			catch(InterruptedException t)
			{
				
			}
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		
		try
		{
			System.out.println("Join In");
			t1.join();
			System.out.println("Join Out");
		}
		catch(InterruptedException r)
		{
			System.out.println("This is Exception block");
		}
		t1.start();
		t2.start();

	}

}
