package AbstractDemo;

public abstract class shape {
	protected float area;
	abstract void calArea();
	void show() {
		System.out.println("area of shape:"+area);
	}
}
