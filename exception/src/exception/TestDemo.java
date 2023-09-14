package exception;
import java.util.*;
public class TestDemo {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter roll no:");
		int roll=obj.nextInt();
		if(roll<0)
		{
			throw new ArithmeticException("roll no cannot be negative");
		}
		else {
			System.out.println("valid roll no");
		}

	}

}
