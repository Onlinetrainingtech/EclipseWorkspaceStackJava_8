class Demo extends Thread
{
	public void run()
	{
		System.out.println("This is run method..");
		System.out.println("CurrentThreadName is::"+currentThread().getName());
		System.out.println("CurrentThreadPriority:"+currentThread().getPriority());
	}
	void get1()
	{
		System.out.println("This is Normal method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		Demo t2=new Demo();
		//Thread s1=new Thread(t1);
		t1.start();
		t1.setName("eduelearn");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t1.get1();

	}

}
