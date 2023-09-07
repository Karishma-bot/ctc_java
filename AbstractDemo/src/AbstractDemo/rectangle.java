package AbstractDemo;

public class rectangle extends shape {
	private float l,b;
	public rectangle()
	{
		this.l=5.0f;
		this.b=10.0f;
	}

	public rectangle(float l, float b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	void calArea() {
		super.area=l*b;
		
	}
	
	
}
