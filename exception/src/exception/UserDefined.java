package exception;
import java.util.*;
public class UserDefined {
	private static int age;
	static void validate() throws Age{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter age:");
		age=ob.nextInt();
		if(age<18) {
			throw new Age("invalid age,you are not eligible");
		}
		else {
			System.out.println("you are eligible");
		}
	}
}
