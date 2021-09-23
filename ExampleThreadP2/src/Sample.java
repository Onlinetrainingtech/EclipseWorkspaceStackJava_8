class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
			System.out.println("ThreadIn::"+i);
			Thread.sleep(10000);
			System.out.println("ThreadOut::"+i);
			}
			catch(InterruptedException t)
			{
				System.out.println(t);
			}
		}
	}
}

public class Sample {

	public static void main(String[] args) {
		
	        Demo t1=new Demo();
	        //System.out.println("Thread is Stop::"+t1.isInterrupted());
	        while(true)
	        {
	        	System.out.println("*****");
	        t1.start();
	        }
	        //System.out.println("Thread is Alive or not::"+t1.isAlive());
	        

	}

}
