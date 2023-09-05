package task1;

public class circle {
	int radius;
	String colour;
	void getInput(int radius,String colour)
	{
		this.radius=radius;
		this.colour=colour;
	}
	void calArea(int r)
	{
		r=radius;
		System.out.println("area of circle:"+(3.14*r));
	}
}
