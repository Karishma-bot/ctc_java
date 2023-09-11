package exception;
import java.util.*;
public class division {

	public static void main(String[] args) {
		int a=4,b=0,c=0;
		try {
		c=a/b;
		System.out.println("division is:"+c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("exception caught"+e.getMessage());
		}
	}

}
