class Demo
{
	void arithmeticOperators()
	{
		int a=10,b=20;
		System.out.println("Addition::"+(a+b));
		System.out.println("Divided::"+(a/b));
		System.out.println("Mod..::"+(a%b));
		
	}
	void comparisionOperator()
	{
		int a1=100,b1=20;
		System.out.println("Lessthan<= is::"+(a1<b1));
		System.out.println("greaterthan<= is::"+(a1>b1));
		System.out.println("Equalto== is::"+(a1==b1));
	}
	void logicalOperators()
	{
		int a2=100,b2=200;
		System.out.println("LogicalAnd::"+((a2<b2)&&(b2>a2)));//True
		System.out.println("LogicalAnd::"+((a2>b2)&&(b2>a2)));//False
		System.out.println("LogicalOR::"+((a2<b2)||(b2>a2)));//True
		System.out.println("LogicalNOT::"+!(a2<b2));//False
	}
	void bitwiseoperator()
	{
		int a3=2,b3=3;
		System.out.println("BitWiseAND::"+(a3&b3));
		System.out.println("BitWiseOR::"+(a3|b3));
		System.out.println("XOR is::"+(a3^b3));
		System.out.println("leftshiftoperator::"+(b3<<1));
		System.out.println("Rightshiftoperator::"+(b3>>1));
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		//f1.arithmeticOperators();
		//f1.comparisionOperator();
		//f1.logicalOperators();
          f1.bitwiseoperator();
	}

}
