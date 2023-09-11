package multipleInheritance;

public class Demo implements ChildInheritance,ParentInterface{

	@Override
	public void print() {
		System.out.println("parent interface method");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("child interface method");
	}
	
}
