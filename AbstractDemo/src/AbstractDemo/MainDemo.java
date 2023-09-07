package AbstractDemo;

public class MainDemo {

	public static void main(String[] args) {
		square sq=new square();
		sq.calArea();
		sq.show();
		rectangle re=new rectangle();
		re.calArea();
		re.show();
		shape sh;
		sh=new square(4.0f);
		sh.calArea();
		sh.show();

	}

}
