package constructorTypes;
//types of constructor
public class area {
	int l;
	int b;
	area()
	{
		l=0;
		b=0;
	}
	area(int a)
	{
		l=a;
		b=0;
	}
	area(int c,int d)
	{
		l=c;
		b=d;
	}
	void display()
	{
		System.out.println("l="+l+"\t"+"b="+b);
	}
}
